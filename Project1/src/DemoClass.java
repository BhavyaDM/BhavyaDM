import java.sql.*;
import com.mysql.*;


public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//Class.forName();
			String url="jdbc:mysql://localhost:3306//student";
			String uname="root";
			String pass="";
			String Query="select * from studs where password=1";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(connectionString , Username,Password);
			if(con!=null)
			{
				System.out.println("Connected");
			}
			else
			{
				System.out.println("Not Connected");
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}

