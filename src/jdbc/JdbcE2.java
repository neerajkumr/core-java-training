package jdbc;

import java.sql.*;
import java.util.Scanner;

public class JdbcE2 {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the id");
		Integer id=sc.nextInt();
		System.out.println("Enter the age");
		Integer age=sc.nextInt();
		PreparedStatement st=conn.prepareStatement(("INSERT INTO STUDENT_DETAILS VALUES(?,?,?)"));
		st.setString(1, name);
		st.setInt(2,age);
		st.setInt(3,id);
		st.execute();
		ResultSet rs=st.executeQuery("SELECT * FROM STUDENT_DETAILS");
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3));
		}
		sc.close();
		conn.close();
	}
}
