package com.example.demo.dao;
   
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
 
import com.example.demo.entities.UsersRoles;
 

@Repository
public interface UserRolesRepository extends JpaRepository<UsersRoles, String>  
{  
	@Query("select ur from UsersRoles ur where ur.role.role = :r and ur.user.username = :u")
	public UsersRoles findByRoleAndUser( @Param("r")String role, @Param("u")String username  );  
}  









