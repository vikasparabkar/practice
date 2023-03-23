package practice;

import java.util.HashMap;
import java.util.Map;

public class ppppp {

	public static void main(String[] args) {
		
		//Occurance of words in string
		String x="my my name is is vikas";
		
		HashMap<String, Integer>hm=new HashMap<String, Integer>();
		String words[]=x.split(" ");
		for(String word:words) {			
			Integer count=hm.get(word);
			if(count==null) {
				hm.put(word, 1);
			}else {
				hm.put(word, count+1);
			}
		}System.out.println(hm);

	}

}
