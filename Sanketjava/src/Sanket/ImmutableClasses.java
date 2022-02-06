package Sanket;

import java.util.Date;

public class ImmutableClasses {
		
	 public static void main(String[] args) {
		 String a = "       sanket Dilip shete ";
		 System.out.println(a);
        System.out.println( "your name after trim is = "  +a.trim());
        String t= a.trim();
		 System.out.println( " total number of charector in your name is = "+t.length());
         System.out.println(" your name is upper case is " +t.toUpperCase());
         System.out.println(" your name is lower case " +t.toLowerCase());
         System.out.println(t.replace(" " , ""));
         

System.out.println(t.replace(""," "  ));
		 char[] b =  a.toCharArray();;
		 for ( char d : b) {
		 System.out.print(" -  " +d);
		 }
		 
		 
	 }
}