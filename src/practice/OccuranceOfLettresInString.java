package practice;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfLettresInString {

	public static void main(String[] args) {
		
//		String x="My Space Class";
//		String y="";
//		for(int i=x.length()-1; i>=0; i--) {
//			 y=y+x.charAt(i);
//		}System.out.println(y);
		
		String x="My Space Class";
		
		HashMap<Character, Integer>hm=new HashMap<Character, Integer>();
		
		for(int i=0; i<x.length(); i++) {
			if(hm.containsKey(x.charAt(i))) {
				int count=hm.get(x.charAt(i));
				hm.put(x.charAt(i), count+1);
			}else {
				hm.put(x.charAt(i), 1);
			}
		}
		for(Map.Entry<Character, Integer>hm1:hm.entrySet()) {
			System.out.println(hm1.getKey()+ " "+ hm1.getValue());
		}

	}

}
