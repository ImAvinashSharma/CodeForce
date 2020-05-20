package avinashCode;
import java.util.Scanner;
public class NextRound {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		int c=0;
		for(int i = 0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i = 0;i<n;i++) {
			if(arr[i]>0) {
				if(arr[i]>=arr[k]) {
					c++;
				}
			}
		}
		System.out.println(c);
		sc.close();
	}
}
