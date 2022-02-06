package Sanket3;

import java.util.Arrays;
import java.util.Scanner; 

final class StringDemo 
{
	
	public static void main(String[] args) 
	{
		
	System.out.println( " Please enter two word to compare whether they are equal or not  (camelcase allowed )  ");
	Scanner sc = new Scanner(System.in );
	String s1 = sc.next();
	String s2 = sc.next();

	

	
   String i= s1.trim();
    String k= s2.trim();
    
    
	if   (i.equalsIgnoreCase(k)== true  )
		
	{
		System.out.println(  " your two string is equal "+ s1 +s2 );

	}
	else 
	{
		System.out.println("your string is not equal ");
	}
}
}