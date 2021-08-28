package com.vikrant.java.essentials.base;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String args[] ) throws Exception 
    {	

    	//Write code here
        Scanner sc  = new Scanner(System.in);
        String virus = sc.next().trim();
        int n = sc.nextInt();
        
//        System.out.println(virus +" "+n);
        List<String> input = new ArrayList<String>();
        for(int i=0;i<n;i++)
        {	String blood = sc.next();
        	input.add(blood);
            
        }
        for(String s: input){
        	String res = test(virus, s);
        	System.out.println(res);
        }


   }

   public static String test(String v, String b)
   {
    if(check(b, v))
       {
           return "POSITIVE";

       }
       else
       {
           return "NEGATIVE";
       }
   }
   
   public static boolean testReport(String blood, String virus, int b_len, int v_len)
   {
       if(b_len==0)
       {
       return true;
       }
        if(v_len==0)
        {
         return false;
        }
       
         if(virus.charAt(v_len-1) == blood.charAt(b_len-1))
           {
               return testReport(blood, virus, b_len-1, v_len-1);
           }
           
               return testReport(blood, virus, b_len, v_len-1);
           
       
   }
   
   public static boolean check(String blood, String virus){
	   boolean status = false;
	   int b=blood.length();
	   int v =virus.length();	   
	   while(b>0 && v>0){
		   if(blood.charAt(b-1)==virus.charAt(v-1)){
			   b--;
			   v--;
		   }else{
			   v--;
		   }
	   }
	   if(b==0)
		   status = true;
	   return status;
   }
   
}

