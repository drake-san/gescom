package com.example.demo.metier;

import java.util.Date;
import java.util.List; 

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest; 
import org.springframework.stereotype.Service;

import com.example.demo.dao.CommandeRepository;
import com.example.demo.entities.Client;
import com.example.demo.entities.Commande;
import com.example.demo.entities.Dossier;
import com.example.demo.entities.Fournisseur;
import com.example.demo.imetier.ICommandeMetier;
 

@Service
@Transactional
public class CommandeMetierImpl implements ICommandeMetier
{

	@Autowired private CommandeRepository cmdRep; 
	
	@Override
	public List<Commande> getCommandes() {
		// TODO Auto-generated method stub
		return cmdRep.findAll();
	}

	@Override
	public Page<Commande> getCommandes(Long numDossier,int page, int size) { 
		return cmdRep.findAll(new PageRequest(page, size));
	}
 
	@Override
	public Commande saveCommande(Commande commande) { 
		return cmdRep.save(commande);
	}
	
	@Override
	public Commande saveCommande(Long num, Date date, boolean valide, Client clt, Fournisseur frs,Dossier dos) {
		Commande cmd = new Commande();
		cmd.setNumero(num);
		cmd.setClient(clt);
		cmd.setValide(valide);
		cmd.setDossier(dos); 
		return cmdRep.save(cmd); 
	}

	@Override
	public boolean deleteCommande(Long num) { 
		Commande cmd = cmdRep.getOne(num);
		if(cmd==null) return false;
		cmdRep.delete(cmd);
		return true;
	}

	@Override
	public Commande getCommande(Long num) { 
		return cmdRep.getOne(num);
	}

	@Override
	public Page<Commande> getCommandesClients(Long numDossier, int page, int size) { 
		return cmdRep.findAllCommandesClients(numDossier,new PageRequest(page, size) );
	}

	@Override
	public Page<Commande> getCommandesFournisseurs(Long numDossier,int page, int size) { 
		return cmdRep.findAllCommandesFournisseurs(numDossier,new PageRequest(page, size));
	}

	@Override
	public Page<Commande> getCommandesClients(Long numDossier,Date date, int page, int size) { 
		return cmdRep.findAllCommandesClients(numDossier,date, new PageRequest(page, size));
	}

	@Override
	public Page<Commande> getCommandesFournisseurs(Long numDossier,Date date, int page, int size) { 
		return cmdRep.findAllCommandesFournisseurs(numDossier,date, new PageRequest(page, size));
	}

	@Override
	public Page<Commande> getCommandesOfClient(Long numDossier,String code, int page, int size) { 
		return cmdRep.findAllCommandesOfClient(numDossier,code, new PageRequest(page, size));
	}

	@Override
	public Page<Commande> getCommandesOfFournisseur(Long numDossier,String code, int page, int size) { 
		return cmdRep.findAllCommandesOfFournisseur(numDossier,code, new PageRequest(page, size));
	}

	@Override
	public Page<Commande> getCommandesOfClient(Long numDossier,String code, Date date, int page, int size) { 
		return cmdRep.findAllCommandesOfClient(numDossier,code, date, new PageRequest(page, size));
	}

	@Override
	public Page<Commande> getCommandesOfFournisseur(Long numDossier,String code, Date date, int page, int size) { 
		return cmdRep.findAllCommandesOfFournisseur(numDossier,code, date, new PageRequest(page, size));
	}
 

	@Override
	public Page<Commande> getCommandesClients(Long numDossier,Boolean valide, int page, int size) { 
		return cmdRep.findAllCommandesClients(numDossier,valide,new PageRequest(page, size));
	}

	@Override
	public Page<Commande> getCommandesClients(Long numDossier,Boolean valide, Date date, int page, int size) {
		return cmdRep.findAllCommandesClients(numDossier,valide, date, new PageRequest(page, size));
	}

	@Override
	public Page<Commande> getCommandesOfClient(Long numDossier,String code, Boolean valide, int page, int size) {
		return cmdRep.findAllCommandesOfClient(numDossier,code, valide, new PageRequest(page, size));
	}

	@Override
	public Page<Commande> getCommandesOfClient(Long numDossier,String code, Boolean valide, Date date, int page, int size) {
		return cmdRep.findAllCommandesOfClient(numDossier,code, date, new PageRequest(page, size));
	}

	@Override
	public Page<Commande> getCommandesFournisseurs(Long numDossier,Boolean valide, int page, int size) {
		return cmdRep.findAllCommandesFournisseurs(numDossier,valide, new PageRequest(page, size));
	}

	@Override
	public Page<Commande> getCommandesFournisseurs(Long numDossier,Boolean valide, Date date, int page, int size) {
		return cmdRep.findAllCommandesFournisseurs(numDossier,valide, date, new PageRequest(page, size));
	}

	@Override
	public Page<Commande> getCommandesOfFournisseur(Long numDossier,String code, Boolean valide, int page, int size) {
		return cmdRep.findAllCommandesOfClient(numDossier,code, valide, new PageRequest(page, size));
	}

	@Override
	public Page<Commande> getCommandesOfFournisseur(Long numDossier,String code, Boolean valide, Date date, int page, int size) {
		return cmdRep.findAllCommandesOfFournisseur(numDossier,code, valide, date, new PageRequest(page, size));
	}

	@Override
	public int getNombreCommandes(Long numDossier) {
		return cmdRep.count(numDossier);
	}

	@Override
	public int getNombreCommandes(Date d1, Date d2) {
		return cmdRep.countBetween(d1,d2);
	} 
 
}
