package com.example.repository;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class ConnectionDB {
		
	private final String driver = "org.postgresql.Driver";
	private final String url = "jdbc:postgresql://localhost:5432/devices";
	private final String username = "postgres";
	private final String password = "123";
	
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	
	public DriverManagerDataSource connect(){
		dataSource.setDriverClassName(driver);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
	}

}
