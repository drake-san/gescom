package com.example.demo.dao;
  
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Transport;


@Repository
public interface TransportRepository extends JpaRepository<Transport, Long>  
{
}  

