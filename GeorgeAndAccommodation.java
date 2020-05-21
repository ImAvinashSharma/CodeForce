
import java.util.Scanner;
public class GeorgeAndAccommodation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0,b=0,count=0;
		for(int i = 0;i<n;i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(b-a>=2) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
