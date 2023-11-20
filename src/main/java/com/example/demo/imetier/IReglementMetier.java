package com.example.demo.imetier;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.demo.entities.Reglement;
 

public interface IReglementMetier 
{ 
	public List<Reglement> getReglements();
	public Page<Reglement> getReglements(int page, int size ); 
	public Reglement getReglement( Long id );   
	public Reglement saveReglement(Reglement reglement);
	public boolean deleteReglement(Long id);
}
