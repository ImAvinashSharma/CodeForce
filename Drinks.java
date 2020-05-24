package day5;

import java.util.Scanner;

public class Drinks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum =0;
		for(int i =0;i<n;i++) {
			int num = sc.nextInt();
			sum=sum+num;
		}
		System.out.println(String.format("%.12f",sum/n));
		sc.close();
	}

}
