package practice;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=11;
		int count=0;
		int count1;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count=count+1;
			}
		}if(count==2) {
			System.out.println(num+ " is Prime number");
		}else {
			System.out.println("Not Prime Number");
		}
		
		System.out.println("Prime numbers upto "+num+" are:");
		for(int i=1; i<=num; i++) {
			count1=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count1=count1+1;
				}
			}
		if(count1==2) {
			System.out.println(i);
		}}
		
	}

}
