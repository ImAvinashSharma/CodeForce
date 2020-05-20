package avinashCode;
import java.util.Scanner;
public class PetyaAndStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("0");
		}
		else if(str1.toLowerCase().compareTo(str2.toLowerCase())>0) {
			System.out.println("1");
		}
		else if(str1.toLowerCase().compareTo(str2.toLowerCase())<0){
			System.out.println("-1");
		}
		sc.close();

	}

}
