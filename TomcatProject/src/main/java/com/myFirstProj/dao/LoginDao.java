package com.myFirstProj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.myFirstProj.util.Dbutil;

public class LoginDao {

	public static boolean validate(String username, String password){
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection conn = null;
		boolean status = false;
		
		try {
			
			if (conn == null || conn.isClosed()) {
				conn = Dbutil.getConnection();
			}
			ps = conn.prepareStatement("select * from login where username=? and userpass=?");
			ps.setString(1, username);
			ps.setString(2, password);
			
			rs = ps.executeQuery();
			status = rs.next();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Sql non risponde");
		}
		return status;
		
	}
}
