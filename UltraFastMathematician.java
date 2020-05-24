
import java.util.Scanner;
public class UltraFastMathematician {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		char ch3[] = new char[str1.length()];
		for(int i =0;i<str1.length();i++) {
			if(ch1[i]==ch2[i]) 
				ch3[i]='0';
			else if(ch1[i]=='1'&&ch2[i]=='0') 
				ch3[i]='1';
			else if(ch1[i]=='0'&&ch2[i]=='1') 
				ch3[i]='1';
		}
		String str = new String(ch3);
		System.out.println(str);
		sc.close();
	}

}
