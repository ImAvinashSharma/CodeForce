package day6;
import java.util.Scanner;
public class VanyaAndCubes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0,h=0;
		while (sum<= n){
			h++;
			sum += (h*(h+1))/2;
		}
		System.out.println(h-1);
		sc.close();
	}

}
