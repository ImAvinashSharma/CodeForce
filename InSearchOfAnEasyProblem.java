package day5;

import java.util.Scanner;
public class InSearchOfAnEasyProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int curmax = 0;
		for(int i =0;i<n;i++) {
			int cur = sc.nextInt();
			curmax = Math.max(cur, curmax);
		}
		System.out.println(curmax>0?"HARD":"EASY");
		sc.close();
	}

}
