
package filter;


import java.sql.*;
import java.util.*;

public class Filter 
{
    void check(String ch)
    {
        int i=0;
    String a;
    String name;
    String lower;
    Scanner sc=new Scanner(System.in);
    
    try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-PN41O0V:1521:XE","rahul", "rahul");    
     Statement st=con.createStatement();
   
    a=ch;  
    lower=a.toLowerCase();
      String SQL="Select name from filter where name='"+lower+"'";
       ResultSet rs =st.executeQuery(SQL);
       if(rs.next())
       {
       
           System.out.println("message failed");
       }
       
     else
     {
          System.out.println("good message");
        
     }
     }
       catch(Exception e)
               {
               System.out.println(e.getMessage());
               }
    }
    
}
