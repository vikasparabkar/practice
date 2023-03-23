package practice;

import java.util.Arrays;

public class pppp {

	public static void main(String[] args) {
		
		//Fibbonaci series
		int n1=0, n2=1, n3;
		int finum=6;
		System.out.print(n1+ " "+n2);
		for(int i=2; i<finum; i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
		//Palindrome
		String x="MoM";
		String y="";
		
		for(int i=x.length()-1; i>=0; i--) {
			y=y+x.charAt(i);
		}
		System.out.println(y);
		if(x.contains(y)) {
			System.out.println("Given string is palindrome");
		}else {
			System.out.println("Given string is not palindrome");
		}
		
		//Prime number
		int num=20;
		int count=0;
		for(int i=1; i<=num; i++) {
			
			if(num%i==0) {
				count++;
			}
		}if(count==2) {
			System.out.println("Prime number");
		}else {
			System.out.println("not prime number");
		}
		
		//Print all prime numbers upto given max number
		int MaxNumber=20;
		
		for(int i=1; i<=MaxNumber; i++) {
			int count1=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count1++;
				}
			}if(count1==2) {
				System.out.println(i);
			}
		}
		
		//Factorial of number
		float number=5;
		float fact=1;
		for(float i=number; i>0; i--) {
			fact=fact*i;
		}
		System.out.println(fact);
		
		//reverse a string
		
		String my="Vikas Parabkar";
		String h="";
		
		for(int i=4; i>=0; i--) {
			h=h+my.charAt(i);
		}
		System.out.println(h);	
		
		//print series 2, -4, 6, -8, 10.....
		int MaxNum=20;
		int count5=1;
		for(int i=2; i<=MaxNum; i=i+2) {
			
			if(count5%2==1) {
				System.out.println(i);
			}else{
				System.out.println(-i);
			}
			count5=count5+1;
		}
		//print only even numbers from array
		int a[]= {11,2,66,74,45,123};
		int count4 =0;
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				count4++;
				System.out.println(a[i]);
			}
		}
		System.out.println(count4);
		
		//search a number from array
		int a1[]= {1,2,3,4,5,6};
		boolean b=false;
		int b1=7;
		for(int i=0; i<a.length; i++) {
			if(a1[i]==b1) {
				b=true;
				break;
			}
		}
		if(b==true) {
			System.out.println("given number is present in array");
		}else{
			System.out.println("number is not present");
		}
		
		//occurrence of number in array
		
		int z[]= {1,2,3,4,5,6,1,2,3,6};
		int z1=6;
		int count7=0;
		for(int i=0; i<a.length; i++) {
			if(z[i]==z1){
				count7++;
			}
		}System.out.println(count7);
		
		//Print max number from array
		
		int max[]= {1,2,3,45,4,5,6};
		int maxNumber=max[0];
		for(int i=0; i<max.length; i++) {
			if(max[i]>maxNumber) {
				maxNumber=max[i];
			}
		}
		System.out.println(maxNumber);
		
		//sort array
		int[] v= {1,5,8,6,5,2,3};
		Arrays.sort(v);
		for(int i=0; i<v.length; i++) {
			System.out.print(" "+v[i]);
		}
	}

}
