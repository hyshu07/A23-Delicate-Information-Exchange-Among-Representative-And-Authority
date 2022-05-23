package Dbconn;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconn {

	static Connection con;

	public static Connection create(){
		try{
			Class.forName("com.mysql.jdbc.Driver");  
				con=DriverManager.getConnection("jdbc:mysql://database-1.cgdpr0148rhw.ap-south-1.rds.amazonaws.com:3306/bc04","admin1","1234567890");	 
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return con;
	
}}
