package practice;

public class ExtractNumbersFromString {

	public static void main(String[] args) {
		
		String a="Vi12134ka5154s";
		String b="";
		String c="";
		for(int i=0; i<a.length(); i++) {
			if(Character.isDigit(a.charAt(i))) {
				b=b+a.charAt(i);
			}else {
				c=c+a.charAt(i);
			}
			
		}
		System.out.println(b);
		System.out.println(c);
	}

}
