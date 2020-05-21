package day2;
import java.util.Scanner;
public class YoungPhysicist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum1=0,sum2=0,sum3=0;
		for(int i = 0;i<n;i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			sum1 = sum1 + num1;
			sum2 = sum2 + num2;
			sum3 = sum3 + num3;
		}
		if(sum1==0&&sum2==0&&sum3==0)
			System.out.println("YES");
		else
			System.out.println("NO");
		sc.close();
	}

}
