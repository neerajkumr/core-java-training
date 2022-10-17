package jdbc;
import java.sql.*;
import java.util.Scanner;
public class JdbcE3 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		ResultSet rs=null;
		Scanner sc=new Scanner(System.in);
		int num=1;
		while(num>0 && num <5) {
			System.out.println("1 -> insert \n 2->deletebyID \n 3->update \n 4->exit");
			num=sc.nextInt();
			if(num==1) {
					CallableStatement cs=conn.prepareCall("insert into student_details value(?,?,?)");
					System.out.println("Enter the name");
					String name=sc.next();
					System.out.println("Enter the ID");
					int id= Integer.parseInt(sc.next());
					System.out.println("Enter the age");
					int age= sc.nextInt();
					cs.setString(1, name);
					cs.setInt(2, age);
					cs.setInt(3,id);
					cs.execute();
					rs=cs.executeQuery("SELECT * FROM STUDENT_DETAILS");
					while(rs.next()) {
						
						System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3));
					}
			}
			else if(num==2) {
					CallableStatement cst=conn.prepareCall("delete from student_details where student_id=? ");
					try {
					System.out.println("Enter the ID to delete");
					int id= sc.nextInt();
					cst.setInt(1,id);
					}
					catch(Exception e) {
						System.err.print("------------ID not found-------------");
					}
					cst.execute();
					rs=cst.executeQuery("SELECT * FROM STUDENT_DETAILS");
					while(rs.next()) {
						
						System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3));
					}
			}
			else if(num==3) {
					CallableStatement cst=conn.prepareCall("update student_details set stu_name=?,age=? where student_id=? ");
					try {
					System.out.println("Enter the ID for which the details to be updated");
					int id= sc.nextInt();
					System.out.println("Enter the name to update");
					String name=sc.next();
					System.out.println("Enter the age to update");
					int age= sc.nextInt();
					cst.setString(1, name);
					cst.setInt(2,age);
					cst.setInt(3, id);
				
					}
					catch(Exception e) {
						System.err.print("------------ID not found-------------");
					}
					cst.execute();
					rs=cst.executeQuery("SELECT * FROM STUDENT_DETAILS");
					while(rs.next()) {
						
						System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3));
					}
				}
		
			else if(num==4) {
			//System.exit(0);
				break;
		}
		
		}
		sc.close();
		conn.close();
	}
}
