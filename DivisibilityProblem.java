
import java.util.Scanner;
public class DivisibilityProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0;i<n;i++) {
			long a= sc.nextLong() , b = sc.nextLong();
			if(a%b==0) 
				System.out.println(0);
			else
				System.out.println(b-a%b);
		}
		sc.close();
	}

}
