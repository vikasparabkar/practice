package practice;

import java.util.HashMap;

public class ppp {

	public static void main(String[] args) {
		
		//Occurrence of letters in string
		
		String x="My name is vikas";
		String y="my my name name is is vikas vikas 1 1 1";
		
		HashMap<Character, Integer>hm=new HashMap<Character, Integer>();
		HashMap<String, Integer>hm1=new HashMap<String, Integer>();
		
		for(int i=0; i<x.length(); i++) {
			if(hm.containsKey(x.charAt(i))) {
				Integer count=hm.get(x.charAt(i));
				hm.put(x.charAt(i), count+1);
			}else {
				hm.put(x.charAt(i), 1);
			}
		}
		System.out.println(hm);
		
		//Occurance of words in a string
		String[] words=y.split(" ");
		
		for(String word: words) {
			Integer count=hm1.get(word);
			if(count==null) {
				hm1.put(word, 1);
			}else {
				hm1.put(word, count+1);
			}
		}System.out.println(hm1);
	}

}
