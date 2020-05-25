package day6;
import java.util.Scanner;
public class FancyFence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		for(int i =0;i<n;i++) {
			int k = sc.nextInt();
			if(360%(180-k)==0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}

}
