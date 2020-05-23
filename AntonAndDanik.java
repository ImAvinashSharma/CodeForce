package day4;

import java.util.Scanner;

public class AntonAndDanik {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		char ch[]= str.toCharArray();
		int a=0,d=0;
		for(int i = 0;i<n;i++) {
			if(ch[i]=='A')
				a++;
			else if(ch[i]=='D')
				d++;
		}
		if(a==d)
			System.out.println("Friendship");
		else if(a>d)
			System.out.println("Anton");
		else if(a<d)
			System.out.println("Danik");
		sc.close();
	}

}
