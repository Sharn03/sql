package sql;
import java.sql.*;
public class demoProject {

	public static void main(String[] args) {
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/guvi_tasks","root","root");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("Select * from empl");
				while(rs.next())
				{
					System.out.println(rs.getString(1)+ " " + rs.getString(2));
				}
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
			
	}

}
