package com.example.demo;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
	public class DbConfig { 
	    @Bean
	    public  BasicDataSource dataSource() throws URISyntaxException {
			URI dbUri = new URI(("mysql://localhost:3306/gescom_db"));
	
//	        String username = dbUri.getUserInfo().split(":")[0];
//	        String password = dbUri.getUserInfo().split(":")[1];
//	        String dbUrl = "jdbc:mysql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath()+"?useSSL=false";

			String userName = "root";
			String password = "lolita123";
			String dbUrl = "jdbc:mysql://localhost:3306/gescom_db?createDatabaseIfNotExist=true&allowPublicKeyRetrieval=True&verifyServerCertificate=false&useSSL=false&requireSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

	        BasicDataSource  basicDataSource = new BasicDataSource ();
	        basicDataSource.setUrl(dbUrl);
	        basicDataSource.setUsername(userName);
	        basicDataSource.setPassword(password);
	
	        return basicDataSource;
	    }
	}
