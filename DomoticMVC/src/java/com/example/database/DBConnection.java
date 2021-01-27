
package com.example.database;

import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class DBConnection {
    
    private final String driver = "org.postgresql.Driver";
    private final String url = "jdbc:postgresql://localhost:5432/devices";
    private final String username = "postgres";
    private final String password = "123";
    
    public DriverManagerDataSource Conectar(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driver);
	dataSource.setUrl(url);
	dataSource.setUsername(username);
	dataSource.setPassword(password);
        return dataSource;
    }
    
}
