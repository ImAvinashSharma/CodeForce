package day4;

import java.util.Scanner;

public class WeirdAlgorithm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.print(n+" ");
		while(n!=1) {
			if(n%2==0) {
				System.out.print((n=n/2)+" ");
			}
			else if(n%2!=0) {
				System.out.print((n=n*3+1)+" ");
			}
		}
		
		sc.close();
	}

}
