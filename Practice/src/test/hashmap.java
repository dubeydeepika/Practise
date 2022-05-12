package test;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
	
	public static void main(String[] args) {
	
	HashMap<String,Integer> data =new HashMap<String,Integer>();
	data.put("JAN", 1);    
	data.put("FEB", 2);    
	data.put("MAR", 3);    
	data.put("APR", 4);    
	data.put("MAY", 5);    
	data.put("JUN", 6);   
	
	String month ="MAR";
	Integer newmonth = data.get(month);
	 
	System.out.println(month);
	Integer nextmonth = newmonth+1;
	
	System.out.println(nextmonth);
	
	for(Map.Entry<String, Integer> e : data.entrySet())
	{
		System.out.println("Month=" +e.getKey() + ","  + "Number="  + e.getValue());
		//System.out.println(data.entrySet());
	}
	}

}
