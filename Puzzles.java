package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int [k];
		for(int i =0 ;i<k;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int least = arr[n-1] - arr[0];
	    for (int i = 1; i <= k - n; ++i)
	    {
	        if (arr[i+n-1] - arr[i] < least)
	        {
	            least = arr[i+n-1] - arr[i];
	        }
	    }
		System.out.println(least);
		sc.close();
	}

}
