package day6;
import java.util.Arrays;
import java.util.Scanner;
public class AntonAndLetters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(ch[i]=='{') 
				ch[i]=' ';
			else if(ch[i]=='}') 
				ch[i]=' ';
			else if(ch[i]==',') 
				ch[i]=' ';
			
		}
		int k=1;
		Arrays.sort(ch);
		str = new String(ch);
		str=str.replaceAll("\\s","");
		if(str.isEmpty())
			System.out.println(k-1);
		else {
		char ch1[] = str.toCharArray();
		for(int i=1;i<str.length();i++) {
			if(ch1[i]!=ch1[i-1]) k++;
		}
		System.out.println(k);
		}
		sc.close();
	}

}
