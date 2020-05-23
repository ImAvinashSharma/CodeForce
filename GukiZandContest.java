package day4;
import java.util.Scanner;

public class GukiZandContest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int [n];
		for (int i = 0; i < n; i++) 
			a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int s = 1;
            for (int j = 0; j < n; j++) if (a[j] > a[i]) s++;
	            System.out.print(s);
	            if (i < n - 1) 
	            	System.out.print(" ");
	            else
	                System.out.println();
        }
		sc.close();
	}

}
