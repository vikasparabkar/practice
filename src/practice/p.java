package practice;

import java.util.HashMap;
import java.util.Map;

public class p {

	public static void main(String[] args) {
		
		String x="My Name Is88 vVikas";
		String y="";
		
		//Occurrence of characters
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		
		for(int i=0; i<x.length(); i++) {
			
			if(hm.containsKey(x.charAt(i))) {
				int count=hm.get(x.charAt(i));
				hm.put(x.charAt(i), count+1);
			}else {
				hm.put(x.charAt(i), 1);
			}
		}
		for(Map.Entry<Character, Integer> hm1: hm.entrySet()) {
			System.out.println(hm1.getKey()+ " "+ hm1.getValue());
		}
		
		//Occurrence of word in a string
		
		String a="my my name name is is vikas";
		
		HashMap<String, Integer> hash=new HashMap<String, Integer>();
		String[] words= a.split(" ");
		for(String word: words) {
			Integer count=hash.get(word);
			
			if(count==null) {
				hash.put(word, 1);
			}else {
				hash.put(word, count+1);
			}
		}
		System.out.println(hash);
		
		
		//prime number
		
		int num=11;
		int count=0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count=count+1;
			}
		}
		if(count==2) {
			System.out.println("given number "+num+" is prime number");
		}else {
			System.out.println("given number "+num+" is not prime number");
		}
		
		//Print prime numbers upto given number
		
		int number=20;
		
		for(int i=1; i<=number; i++) {
			int count1=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count1++;
				}
			}if(count1==2) {
				System.out.println(i);
			}
		}
		
		//star pattern
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		for(int i=5; i>0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Occurence
		
	}

}
