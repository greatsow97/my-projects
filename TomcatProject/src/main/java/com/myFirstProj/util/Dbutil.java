package com.myFirstProj.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;




public class Dbutil {

	
	static Connection conn = null;
	
	
	static {
		
		try {
			Context cxt = new InitialContext();
			DataSource ds  = (DataSource) cxt.lookup("java:comp/env/jdbc/TestDB");
			conn= ds.getConnection();
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Connessione non avvenuta pt1");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("connesione non avvenuta pt2");
		}
		

	}
	public static Connection getConnection() {
		return conn;
	}
}
