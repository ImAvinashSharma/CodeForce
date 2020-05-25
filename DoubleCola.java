package day6;
import java.util.Scanner;
public class DoubleCola {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		n--;
		while(n>=5) {
			n=n-5;
			n=n/2;
		}
		String mas[] = {
		        "Sheldon",
		        "Leonard",
		        "Penny",
		        "Rajesh",
		        "Howard"
		};
		System.out.println(mas[(int) n]);
		sc.close();
	}

}
