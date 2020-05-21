
import java.util.Scanner;
public class Word {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch[] = str.toCharArray();
		int c_up=0,c_low=0;
		for(int i = 0;i<str.length();i++) {
			if(Character.isUpperCase(ch[i])) {
				c_up++;
			}
			else {
				c_low++;
			}
		}
		if(c_up>c_low)
			System.out.println(str.toUpperCase());
		else
			System.out.println(str.toLowerCase());
		sc.close();
	}

}
