package com.conexaoSQL.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.conexaoSQL.bean.Login;
import com.mysql.jdbc.Statement;

public class LoginDao extends Login {
	
	public Connection conectarBD() {
		Connection con = null; 
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1/projetofinal?user=root&password="; 
			con = DriverManager.getConnection(url); 
		}catch (Exception e) { }
		return con;}

	public String nome=""; 
	 
    public boolean result = false; 
	
	public boolean verificarUsuario (String email, String password){

			String sql = "";
	        Connection con = conectarBD();
	        
	        sql += "SELECT nome FROM usuarios";
	        sql += "WHERE email = " + "'" + email + "'";
	        sql += "AND password = " + "'" + password + "'"; 
	        
	         try {
	        	 Statement st = (Statement) con.createStatement();
	        	 ResultSet rs = st.executeQuery(sql);
	        	 if(rs.next()) {
	        		 result = true;
	        		 nome = rs.getString("nome");}
	         }catch (Exception e) { 
	        		 
	      }
	      return result; 

	}
	
}
