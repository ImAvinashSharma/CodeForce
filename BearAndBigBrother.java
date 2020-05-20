package avinashCode;
import java.util.Scanner;
public class BearAndBigBrother {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i=0;
		if(a==b)
			System.out.println(1);
		else {
			boolean t = true;
			for(i = 0;t;i++) {
				a=a*3;
				b=b*2;
				if(a>b)
					t = false;
			}
			System.out.println(i);
		}
		
		sc.close();
	}

}
