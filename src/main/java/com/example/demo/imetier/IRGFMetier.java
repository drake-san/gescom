package com.example.demo.imetier;
 

import com.example.demo.entities.ReglementFacture;
 

public interface IRGFMetier 
{   
	public ReglementFacture getReglementFacture( Long id );   
	public ReglementFacture saveReglementFacture(ReglementFacture reglementFacture);
	public boolean deleteReglementFacture(Long id);
}
