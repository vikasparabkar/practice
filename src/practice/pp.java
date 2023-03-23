package practice;

public class pp {

	public static void main(String[] args) {
		
		//Swap numbers using third variable
		
		int a=10;
		int b=20;
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		//swap numbers without using third variable
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		//WAP to print Series 
		//2,-4,6,-8,10,-12,14,-16....20
		
		int num=20;
		int count=1;
		for(int i=2; i<=num; i=i+2) {
			if(count%2==1) {
				System.out.println(i);
			}else {
				System.out.println(-i);
			}
			count=count+1;
		}
		
		//WAP to print a factorial of a number
		//5! = 5*4*3*2*1
		
		int factorial=1;
		
		for(int i=5; i>0;i--) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
		
		//program to print 12345 pattern
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		//Program to search number from array
		
		int a1[]= {1,2,3,4,5,6};
		boolean flag=false;
		int searchNum=5;
		for(int i=0; i<a1.length; i++) {
			if(a1[i]==searchNum) {
				flag=true;
				break;
			}
		}if(flag==true) {
			System.out.println("given number is present in array");
		}else {
			System.out.println("given number is not present in array");
		}
		
		//search number from array
		
		int a3[]= {1,2,3,4,5,6,7};
		for(int i=0; i<a3.length; i++) {
			if(a3[i]==9) {
				System.out.println("number is present");
				break;
			}
			
		}
		{
			System.out.println("Number is not present in array");
		}
	}

}
