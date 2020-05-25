package day6;
import java.util.Scanner;
public class FafaAndHisCompany {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int c=0;
		for(int i =1;i<=n/2;i++) {
			if(n%i==0)
				c++;
		}
		System.out.println(c);
		sc.close();
	}

}
