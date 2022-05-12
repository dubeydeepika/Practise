package test;

import java.util.ArrayList;

public class Arraylist {
	
	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		a.add("Sunday");
		a.add("Monday");
		a.add(3);
		a.add(4);
		
	    int size=a.size();
	    System.out.println("Size of ArrayList " +size);

	    a.remove(3);
	    
	    int size1=a.size();
	    
	    for(int i=0;i<size1;i++)
	    {
	    	System.out.println(a.get(i));
	    }
		
		
	}

}
