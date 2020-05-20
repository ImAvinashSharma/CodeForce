package avinashCode;
import java.util.Scanner;
public class WordCapitalization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(str.toUpperCase().charAt(0));
		System.out.print(str.substring(1,str.length()));
		sc.close();
	}

}
