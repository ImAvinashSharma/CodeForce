package day2;
import java.util.Scanner;
public class Translation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		if(str1.length()==str2.length()) {
			StringBuilder sb=new StringBuilder(str2);  
			sb.reverse();
			String str = sb.toString();  
			if(str1.equalsIgnoreCase(str))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		else {
			System.out.println("NO");
		}
 		sc.close();
	}

}
