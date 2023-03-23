package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		System.out.println("a"+1+1);
		System.out.println(1+1+"a");
		
		int n, reverse = 0;         
		System.out.println("Enter the number to reverse");       
		Scanner in = new Scanner(System.in);       
		n = in.nextInt();         
		while( n != 0 )       
		{
			reverse = reverse * 10;           
			reverse = reverse + n%10;          
			n = n/10;       }         
			System.out.println("Reverse of entered number is "+reverse);
		}
}
