package day2;
import java.util.Scanner;
public class HQ9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean t=true;
		char ch[] = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(ch[i]=='H'||ch[i]=='Q'||ch[i]=='9') {
				System.out.println("YES");
				t = false;
				break;
			}
		}
		if(t)
			System.out.println("NO");
		sc.close();
	}

}
