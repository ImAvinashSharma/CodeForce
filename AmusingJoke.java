

import java.util.Arrays;
import java.util.Scanner;

public class AmusingJoke {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = sc.next();
		if(str1.length()+str2.length()==str3.length()) {
		str1=str1+str2;
		char ch1[] = str1.toCharArray();
		char ch2[] = str3.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		String sorted1 = new String(ch1);
		String sorted2 = new String(ch2);
		if(sorted1.contains(sorted2))
			System.out.println("YES");
		else
			System.out.println("NO");
		}
		else
			System.out.println("NO");
		sc.close();
	}

}
