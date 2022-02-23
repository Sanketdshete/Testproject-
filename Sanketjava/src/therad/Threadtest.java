package therad;

final class Threadtest {


	X x1  = new X();
	X x2 = new X();
	X x3 = new X ();
	
	class X extends Thread 
	{
	
   @Override
   		public void run() {
	   	super.run();
	   	
	   	
	   	for (int  i=0 ; i<5 ; i++ )
	   	{
	   		System.err.println(+i);
	   	}
}
	}
}

