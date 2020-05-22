package day3;
import java.util.Scanner;
public class MultiplesOf3And5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i =0;i<n;i++) {
		if(i%3==0)
			sum = sum+i;
		else if (i%5==0)
			sum = sum+i;
		}
		System.out.println(sum);
		sc.close();
	}

}
