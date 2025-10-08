package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class SQLprogram {

	public static void main(String[] args) throws SQLException {
		// 1.Create a Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/guvi","root","SQLtesting#3004guvi");
		
		//2.Create Statement/query
		Statement stmt= con.createStatement();
		
		String s= "INSERT INTO STUDENTS VALUES(105, 'Seema','NAGPUR')";
		
		//String s = "UPDATE STUDENTS SET CITY='Nagpur' WHERE STUDENT_ID='104'";
		
		//String s = "DELETE FROM STUDENTS WHERE STUDENT_ID='104'";
		
		//3,Execute Statement/QUERY
		stmt.execute(s);
		
		//4.close the statement
		con.close();
		System.out.println("Query Executed");
		
		

	}

}
