package com.dlqudwp.servlet.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlService {
	
	private Connection connection;
	private Statement statement;
	
	// 데이터 베이스 접속
	public void connect() {
		// 데이터베이스 접속
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		
		//
		String url = "jdbc:mysql://localhost:3306/byungje";
		String userId = "root";
		String password = "root";
		
		connection = DriverManager.getConnection(url, userId, password);
		statement = connection.createStatement();
		
		
		
		} catch (SQLException e) {
			
			e.printStackTrace();
			
			}
	
	
	
	// select 쿼리 수행
	public ResultSet select(String query) {
		
		ResultSet resultSet;
		try {
			resultSet = statement.executeQuery(query);
			return resultSet;
		} catch (SQLException e) {
			
			e.printStackTrace();
			
			
			return null;
			}
		
		
		}
	
	// insert, update, delete
	public int update(String query) {
	
	// 데이터 베이스 접속 끊기
	public void disconnect() {
		try {
	}
	

