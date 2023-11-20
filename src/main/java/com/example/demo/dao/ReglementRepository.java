package com.example.demo.dao;
  
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Reglement;


@Repository
public interface ReglementRepository extends JpaRepository<Reglement, Long>  
{
}  

