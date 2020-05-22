package day3;
import java.util.Scanner;
public class CheapTravel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(m*a<=b)
			System.out.println(n*a);
		else
			System.out.println((n/m)*b+Math.min((n%m)*a,b));
		sc.close();
	}

}
