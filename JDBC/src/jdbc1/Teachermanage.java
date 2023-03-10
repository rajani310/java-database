package jdbc1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teachermanage {
       public static void main(String[] args) throws  IOException {
    	   
    	   System.out.println("welcome to my project ");
    	   
    	   BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    	    
    	   while(true)
    	   {
    		   System.out.println("Press 1 to Insert teacher");
    		   System.out.println("Press 2 to Delete teacher ");
    		   System.out.println("Press 3 to display teacher");
    		   System.out.println("Press 4 to exist app");
    		   System.out.println("Press 5 to update teacher ");
    		   int input= Integer.parseInt(br.readLine());
    		   if(input==1) {
    			   
    			   System.out.println("enter your name");
    			   String  name = br.readLine();
    			   System.out.println("enter your phone");
    			   String  phone = br.readLine();
    			   System.out.println("enter your subject");
    			   String  subject = br.readLine();
    			   
    			   teacher teach=new teacher(name,phone,subject);
    			   boolean answer=teacherDao.insertDao(teach);
    			   if(answer)
    			   {
    				   System.out.println(" Teacher is addeded Successfully");
    			   }
    			   else
    			   {
    				   System.out.println("something went wrong plz try again....");
    			   }
    			   
    			    System.out.println(teach);
    			   
    		   }
    		   else if(input==2) {
    			   
    			   System.out.println("Enter teacher id delete :");
    			   int userId=Integer.parseInt(br.readLine());
    			   boolean id=teacherDao.deleteDao(userId);
    			   if(id)
    			   {
    				   System.out.println("teacher deleted successfully");
    			   }
    			   else
    			   {
    				   System.out.println("sorry user not deleted try again....");
    			   }
    			   
    		   }
    		   else if(input==3) {
    			   
    			   teacherDao.displayDao();
    		   }
    		   else if(input==4) {
    			   break;
    		   }
    		   else if(input==5)   
    		   {  
    			   
    			   teacherDao.UpdateDao();		   
    		   }
    		   else
    		   {
    			  System.out.println("Not choose"); 
    		   }
    		   
    	   }
    		   
    	   System.out.println("Thank you using my application");
	}
}
