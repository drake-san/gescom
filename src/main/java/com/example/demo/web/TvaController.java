package com.example.demo.web;
 

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entities.Tva;
import com.example.demo.imetier.ITvaMetier;


@Controller
public class TvaController  
{
	@Autowired private ITvaMetier metierTva; 
	
	@RequestMapping(value= {"/tva/save"}, method=RequestMethod.POST,produces = "application/json")
	public @ResponseBody Tva saveTva(@Valid Tva tva) 
	{    	  
		System.out.println(tva.getDesignation()+" : "+tva);
		metierTva.saveTva(tva);  
		return tva; 
	} 
 
	@RequestMapping(value="/tva/delete", method=RequestMethod.POST,produces = "application/json")
	public @ResponseBody Boolean deleteTva(@RequestParam(name="code",defaultValue="0")Long code) 
	{  
		if(metierTva.deleteTva(code)) return true;  
		return false;
	}
	
	@RequestMapping(value="/tva/get", method=RequestMethod.POST,produces = "application/json")
	public @ResponseBody Tva getroduit(@RequestParam(name="code")Long code) 
	{  
		Tva tva = metierTva.getTva(code); 
		return tva;
	}
	
}
















