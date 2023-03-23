package practice;

import java.util.HashMap;
import java.util.Map;

public class CopyOneMapElementIntoAnotherMap {

	
public static void main(String[] args) {
	Map<String,Integer> vikas=new HashMap<String,Integer>();
	vikas.put("Rahul", 70);
	vikas.put("Amey", 2);
	vikas.put("Vishal", 20);
	vikas.put("Rohini", 67);
	
	Map<String,Integer> shilpa=new HashMap<String,Integer>();
	for(Map.Entry<String, Integer> x:vikas.entrySet()) {
		shilpa.put(x.getKey(), x.getValue());
	}
	System.out.println(shilpa);
} 
}
