package day4;

import java.util.Scanner;

public class Hulk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str1 = "I hate it";
		String str2 = "I hate that";
		String str3 = "I love it";
		String str4 = "I love that";
		if(n==1) {
			System.out.print(str1);
		}
		else {
		for(int i = 0;i<n-1;i++) {
			if(i%2==0) {
				System.out.print(str2+" ");
			}
			else if(i%2!=0) {
				System.out.print(str4+" ");
			}
		}
		if(n%2==0)
			System.out.print(str3);
		else
			System.out.print(str1);
		}
		sc.close();
	}

}
