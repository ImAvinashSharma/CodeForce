package day4;
import java.util.Scanner;
public class MissingNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n-1];
		for(int i = 0;i<n-1;i++) {
			arr[i]=sc.nextInt();
		}
		long total = ((n)*(n+1))/2;
		System.out.println(total);
		for(int i = 0;i<n-1;i++) {
			total=total-arr[i];
		}
		System.out.println(total);
		sc.close();
	}

}
