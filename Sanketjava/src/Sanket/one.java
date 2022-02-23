package Sanket;

import java.util.ArrayList;

class one
{

public static void main (String[]arg )
{
	
	ArrayList<Integer> Al1 = new ArrayList<>();
	
	Al1.add(2);
	Al1.add(4);
	Al1.add(9);
	Al1.add(6);
	Al1.add(7);
	Al1.add(9);
	Al1.add(8);
	
	ArrayList<Integer> Al2 = new ArrayList<>();
	System.out.println(Al2.hashCode());
	Al2.add(12);
	Al2.add(11);
	Al2.add(14);
	Al2.add(14);
	Al2.add(18);
	Al2.add(19);
	Al2.add(17);
	System.out.println(Al2.hashCode());
	System.out.println(Al1);
	System.out.println(Al2);
	System.out.println(" Al1 size ="+Al1.size());
	System.out.println(" Al2 size ="+Al2.size());
	
	Al1.addAll(Al2);
	System.out.println(Al2.hashCode());
	Al2.iterator();
	System.out.println(Al2.hashCode());
	System.out.println(" Al1 size ="+Al1.size());
	System.out.println("iterator "+Al1);
	Al2.removeAll(Al2);
	
	System.out.println(Al2.size());
}
}