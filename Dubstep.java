package day3;
import java.util.Scanner;
public class Dubstep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(str.replaceAll("WUB"," "));
		sc.close();
	}

}
