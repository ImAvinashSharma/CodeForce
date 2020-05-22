package day3;

import java.util.Scanner;

public class EvenFibonacciNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long c=1,ne=2,s=0;
		s=c+ne;
		long sum = 0;
		while(s<=n) {
			
			c=ne;
			ne=s;
			s=c+ne;
			if(s%2==0)
				sum = sum+s;
		}
		System.out.print(sum+2);
		sc.close();
	}

}
