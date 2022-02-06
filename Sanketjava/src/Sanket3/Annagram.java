package Sanket3;

import java.util.Arrays;
import java.util.Scanner;

public class Annagram {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println( "Please enter first word to check whether annagram or not "  );
		String str1  = sc.nextLine();
		 System.out.println( "Please enter second word to check whether annagram or not ");
		 String  str2  = sc.nextLine();
		

		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if ( str1.length() == str2.length() )
			{
	
				char[] chararray1= str1.toCharArray();
				char[] chararray2= str2.toCharArray();
				
				//sort if sorted same then anagram 
				Arrays.sort ( chararray1);
				Arrays.sort( chararray2);
				boolean result = Arrays.equals(chararray1, chararray2);
				
				if( result)
				{
					System.out.println(" your string is anagram " + str1 +" " + str2);
					
				}
				else 
				{
					System.out.println( "array not equal your string is not anagram " + str1 +" "+ str2);
				}			
			}
		
		else
		{
			System.out.println( " lenth not equal your string is not anagram " + str1 +" "+ str2);
		}
				
		}
	}
