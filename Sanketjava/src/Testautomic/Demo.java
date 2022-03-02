package Testautomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo  {
	 	public static void main(String[] args) throws InterruptedException {
	 		
	          Mythread t1 = new Mythread();
	          
	          Thread th1 = new Thread (t1);
	        Thread th2 = new Thread (t1);
	          th1.start();
	         th2.start();
	          
	     
	         th1.join();
	          th2.join();
	          
	    //      System.out.println(Mythread.number);
	 	System.out.println(Mythread.number1);
	 	}
 }
	 
	class Mythread implements Runnable 
   {
		//static Integer number = 0 ;
		static AtomicInteger number1 = new AtomicInteger(0) ;
	     static public  void Increment ()
		{
		//	number++ ;
			number1.incrementAndGet();
		}
	
		@Override
		public void run() {
			
			for (int i = 0   ; i<100000000  ; i++ )
			{
				Mythread.Increment();
			}
			
		}
   }
	

