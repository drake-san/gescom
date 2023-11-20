package com.example.demo.metier;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ClientRepository;
import com.example.demo.entities.Client;
import com.example.demo.entities.Fournisseur;
import com.example.demo.imetier.IClientMetier;
 

@Service
@Transactional
public class ClientMetierImpl implements IClientMetier
{ 
	@Autowired
	private ClientRepository cltRep;

	@Override
	public List<Client> getClients() {
		return cltRep.findAll();
	}
 
	@Override
	public Client getClient(String code) {
		try { 
			return cltRep.findByCode(code);
		} catch (Exception e) {return null;} 
	}

	@Override
	public Client saveClient(Client frs) {
		return cltRep.save(frs);
	}

	@Override
	public boolean deleteClient(String code) {
		Client frs = cltRep.findByCode(code);
		if(frs!=null) {
			cltRep.delete(frs);
			return true;
		}
		return false;
	}

	@Override
	public Page<Client> getClients(int page, int size) {
		return cltRep.findAll(new PageRequest(page, size));
	}

	@Override
	public Page<Client> getClientsByMotCle(String mc, int page, int size) {
		return cltRep.findAllByMotCle(mc,new PageRequest(page, size));
	} 
 
}
