package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectprovider {

	 static Connection con;
	
	
	public  static Connection create()
	{
		try {
		// load the driver
		Class.forName("com.mysql.jdbc.Driver");
		
		// connection create here....

		String url="jdbc:mysql://localhost:3306/teacher";
		String user="root";
		String password="";
		con = DriverManager.getConnection(url,user,password);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
}
