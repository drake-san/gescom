package com.example.demo.metier;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.example.demo.dao.LivraisonRepository;
import com.example.demo.entities.Livraison;
import com.example.demo.imetier.ILivraisonMetier;
 

@Service
@Transactional
public class LivraisonMetierImpl implements ILivraisonMetier
{ 
	@Autowired
	private LivraisonRepository livRep;

	@Override
	public List<Livraison> getAllLivraisons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Livraison> getAllLivraisons(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Livraison getLivraison(Long id) {
		// TODO Auto-generated method stub
		return livRep.findById(id).get();
	}

	@Override
	public Livraison saveLivraison(Livraison livraison) {
		// TODO Auto-generated method stub
		return livRep.save(livraison);
	}

	@Override
	public boolean deleteLivraison(Long id) { 
		livRep.delete( this.getLivraison(id) );
		return true;
	}

 
}
