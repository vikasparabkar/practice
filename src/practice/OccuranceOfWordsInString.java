package practice;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfWordsInString {

	public static void main(String[] args) {
		
		String a="this this is is automation automation selenium";
		Map<String, Integer> b=new HashMap<>();
		String[] words =a.split(" ");
		for(String word:words) {
			Integer count =b.get(word);
			if(count==null) {
				b.put(word, 1);
			}
			else {
				b.put(word, count+1);
			}
			
		}
		System.out.println(b);
		
		//prime numbers
		int MaxNum=20;
		
		
		for(int i=1; i<=MaxNum; i++) {
			int count=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);
			}
		}
		
		//factorial of number
		int num=5;
		int fact=1;
		for(int i=num; i>0; i--) {
			fact=fact*i;
		}
		System.out.println(fact);
		
		//Find common characters from two string
		
	}

}
