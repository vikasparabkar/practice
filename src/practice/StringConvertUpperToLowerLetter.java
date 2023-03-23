package practice;

public class StringConvertUpperToLowerLetter {

	public static void main(String[] args) {
		
		String a="My Name Is Vikas";
		String b="";
		
		for(int i=0; i<a.length(); i++) {
			if(Character.isUpperCase(a.charAt(i))) {
				b=b+Character.toLowerCase(a.charAt(i));				
			}else {
				if(Character.isLowerCase(a.charAt(i))) {
					b=b+Character.toUpperCase(a.charAt(i));					
				}else {
					b=b+a.charAt(i);
				}
			}
		}
		System.out.println(b);
	}

}
