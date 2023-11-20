package com.example.demo.imetier;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.demo.entities.Transport;
 

public interface ITransportMetier 
{ 
	public List<Transport> findAllTransports();
	public Page<Transport> findAllTransports(int page, int size ); 
	public Transport getTransport( Long code );   
	public Transport saveTransport(Transport transport);
	public boolean deleteTransport(Long ref);
}
