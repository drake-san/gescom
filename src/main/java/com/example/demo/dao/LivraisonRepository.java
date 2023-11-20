package com.example.demo.dao;
  
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Livraison;


@Repository
public interface LivraisonRepository extends JpaRepository<Livraison, Long>  
{
}  

