package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcE1 {

	public static void main(String []args) throws Exception {
		
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
	Statement st=conn.createStatement();
	ResultSet rt=st.executeQuery("SELECT * FROM STUDENT_DETAILS");
	while(rt.next()) {
		System.out.println(rt.getString(1)+" "+rt.getInt(2)+" "+rt.getInt(3));
	}
	conn.close();
}
}
