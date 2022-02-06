package Sanket;

public class Mergearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int []a = { 1,2,3,4} ;
		int []b = { 5,6,7,8,9} ;
		
		
		int c= a.length + b.length ;
		int[] d = new  int [c]	;	
		
		for ( int i= 0 ; i< a.length ; i++ )
			{
			 d [i]= a[i];	
			}
		
				for ( int i=0 ; i<b.length ;i++ ) 
		  
					{
					  d[a.length+i] = b[i];
					}
	  
						for ( int i= 0 ; i< d.length ;i++ )
								{
		  
								System.out.println(d[i] );
								}
}
}
