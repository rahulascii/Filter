/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filter;
import java.util.*;
import filter.Filter;
/**
 * 
 *
 * @author Shivam Gupta
 */
public class senten 
{
    public static void main(String args[])
    {
        Scanner sc1=new Scanner(System.in);
      Filter ob=new Filter();
      String sentence; 
      System.out.println("enter sentence");
      sentence=sc1.nextLine();
      StringTokenizer t = new StringTokenizer(sentence);
      String word ="";
      System.out.println(""+sentence);
       while(t.hasMoreTokens())
       {
        word = t.nextToken();
        System.out.println(word);
        ob.check(word);
     }  
  }
}
    
