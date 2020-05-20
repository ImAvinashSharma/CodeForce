
import java.util.Scanner;
public class WrongSubtraction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		int k = sc.nextInt();
		for(int i =0;i<k;i++) {
			if(num%10==0) {
				num=num/10;
			}
			else
				num--;
		}
		System.out.println(num);
		sc.close();
	}

}
