package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLprogram1 {

	public static void main(String[] args) throws SQLException {
		// 1.Create a Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/guvi","root","SQLtesting#3004guvi");
		
		//2.Create Statement/query
		Statement stmt= con.createStatement();
		
		//String s= "INSERT INTO STUDENTS VALUES(104, 'Simon','CHENNAI')";
		
		//String s = "UPDATE STUDENTS SET CITY='Nagpur' WHERE STUDENT_ID='104'";
		
		//String s = "DELETE FROM STUDENTS WHERE STUDENT_ID='104'";
		
		String s = "SELECT *FROM STUDENTS";
		
		
		//3,Execute Statement/QUERY
		ResultSet rs  = stmt.executeQuery(s);
		
		while (rs.next()) {
			int sid = rs.getInt("STUDENT_ID");
			String fname = rs.getString("NAME");
			String loc = rs.getString("CITY");
			
			System.out.println(sid+" "+fname+" "+loc);
			
		}
		
		
		//4.close the statement
		con.close();
		System.out.println("Query Executed");
		
		

	}

}

