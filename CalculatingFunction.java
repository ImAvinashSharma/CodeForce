package day2;
import java.util.Scanner;
public class CalculatingFunction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		if(n % 2 == 0){
			System.out.printf("%d",n/2);
		}else{
			System.out.printf("%d", -1 * ((n+1)/2) );
		}
		sc.close();
	}

}
