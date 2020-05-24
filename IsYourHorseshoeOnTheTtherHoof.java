package day5;
import java.util.Arrays;
import java.util.Scanner;
public class IsYourHorseshoeOnTheTtherHoof {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[4];
		for(int i =0;i<4;i++) {
			a[i]=sc.nextInt();
		}
		int s=0;
		Arrays.sort(a);
		for(int i =1;i<4;i++) {
			if(a[i]==a[i-1]) s++;
		}
		System.out.println(s);
		sc.close();
	}

}
