package com.example.demo.imetier;
 

import com.example.demo.entities.ReductionFacture;
 

public interface IRDFMetier 
{   
	public ReductionFacture getReductionFacture( Long id );   
	public ReductionFacture saveReductionFacture(ReductionFacture reglementFacture);
	public boolean deleteReductionFacture(Long id);
}
