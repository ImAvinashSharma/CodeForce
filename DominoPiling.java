package avinashCode;
import java.util.Scanner;
public class DominoPiling {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			int x =2,i=0;
			for(i =0;x<=M*N;i++) {
				x+=2;
			}
			System.out.println(i);
			sc.close();
		}
	}
}
