package jdbc1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class teacherDao {

	//Insert query
	public static boolean insertDao( teacher teach) {
		
		boolean f=false;
		try {
		Connection con= connectprovider.create();
		String insert= "insert into teacher(name, phone,subject) values(?,?,?)";
		
		//Prepared-statement
		
		 PreparedStatement prst= con.prepareStatement(insert);
		 
		 // set value of parameter 
		 
		 prst.setString(1,teach.getTeachername());
		 prst.setString(2,teach.getTeacherphone());
		 prst.setString(3,teach.getTeachersubject());
		
		 //execute....query
		 prst.executeUpdate();
		 
		 f=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
	}
	
	//Delete query
	public static boolean deleteDao(int userId)
	{
		boolean f=false;
		try {
		Connection con= connectprovider.create();
		String insert= "delete from teacher where id=? ";
		
		//Prepared-statement
		
		 PreparedStatement prst= con.prepareStatement(insert);
		 
		 // set value of parameter 
		 
		 prst.setInt(1,userId);
		
		
		 //execute....query
		 prst.executeUpdate();
		 
		 f=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
		
	}

	

	// Display query
	public static void displayDao() {
		 
		 try
		 {
			 Connection con= connectprovider.create();
			 String q="select * from teacher;";
			 Statement  stmt=con.createStatement();	 
			 ResultSet set= stmt.executeQuery(q);
			 
			 while(set.next())
			 {
				

				 System.out.println(" Id: "+set.getInt(1));
				 System.out.println(" Name: "+ set.getString(2));
				 System.out.println(" Phone: "+set.getString(3));
				 System.out.println(" Subject: "+set.getString(4));
				 System.out.println("**************************************************** "); 
			 }
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	}

	// update teacher
	public static void UpdateDao( ) {
		
		try {
	    	   
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			
			   System.out.println("enter your name");
			   String  name = br.readLine();
			   System.out.println("enter your phone");
			   String  phone = br.readLine();
			   System.out.println("enter your subject");
			   String  subject = br.readLine();
			   System.out.println("enter your id");
			   int id=Integer.parseInt(br.readLine( ));
			   
			Connection con= connectprovider.create();
			String update= "update teacher set  name=?, phone=?, subject=? where id=? ";
		
		//Prepared-statement
		
			PreparedStatement prst= con.prepareStatement(update);
		 
		// set value of parameter 
		 
			 
			 prst.setString(1,name);
			 prst.setString(2,phone);
			 prst.setString(3,subject);
			 prst.setInt(4,id);


		
		 //execute....query
		 prst.executeUpdate();
		 
		 System.out.println(" project updated");
		 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
}
}