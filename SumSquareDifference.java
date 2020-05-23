package day4;

import java.util.Scanner;

public class SumSquareDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0,sum1 =0;
		for(int i = 1;i<=n;i++) {
			sum = sum + i;
			sum1 = sum1 + i*i;
			
		}
		System.out.print(sum*sum-sum1);
		sc.close();
	}

}
