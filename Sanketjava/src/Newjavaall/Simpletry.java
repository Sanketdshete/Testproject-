package Newjavaall;

import java.util.Scanner;

public class Simpletry {

	public static void main(String[] args) {
      
		while (true)
		try
		{
			
		
			int a, b , c  ;
			int d ;
			System.out.println( " Please enter int value first :");
			Scanner sc = new  Scanner(System.in);
			a = sc.nextInt ();
			b = sc.nextInt();
			  
			
			c= a/b ;
			a=b/a ;
			System.out.println( +c);
			
			 System.out.println("Do you want to continue press 1 for yes  or 0 for N");
			 d = sc.nextInt();
			    
			    if( d==0)
			    {
			    break;
			    }
		}
				catch(java.util.InputMismatchException ae ) 
				{
					
					System.out.println( " Please enter int not string or float "+ae.getMessage());
				}
				catch(java.lang.ArithmeticException e)
				{
				System.out.println( " devide by zero "+e.getMessage());
				}
				finally	
				{
				System.out.println( " dDone using");
				}
	}
	}
