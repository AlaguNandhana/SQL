package jattask12;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

public class JDBCProgram {

	public static void main(String[] args) throws SQLException {
		//Create a Connection
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/guvi","root", "SQLtesting#3004guvi");

		//Create Query
		Statement stmt = con.createStatement();
		

		
		String s= "INSERT INTO EMPLOYEES(empcode, empname, empage,esalary)  VALUES" 
				+"(101,'Jenny' , 25, 10000),"
				+"(102,'Jacky' , 30, 20000),"
				+"(103,'Joe' , 30, 40000),"
				+"(104,'John' , 40, 80000),"
				+"(105,'Shameer' , 25, 90000)";
		
		
		
		
		//Execute Statement/QUERY
		
		
		int rows    = stmt.executeUpdate(s);
		System.out.println(rows  + "records inserted succesfully!");
		
		//close the statement
		con.close();
	
		
		

	}
	
	
	
	
	}


