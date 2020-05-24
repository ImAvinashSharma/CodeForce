
import java.util.Scanner;
public class Magnets {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int i;
			for(i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			sc.close();
			int k=1;
			for(i=0;i<n-1;i++) {
				if(a[i]!=a[i+1]) {
					k++;
				}
			}
			System.out.println(k);
		}
		
	}

}
