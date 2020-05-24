package day5;

import java.util.Scanner;
public class AntonAndPolyhedrons {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++) {
			String str = sc.next();
			if(str.equalsIgnoreCase("Tetrahedron"))
				sum=sum+4;
			if(str.equalsIgnoreCase("Cube"))
				sum=sum+6;
			if(str.equalsIgnoreCase("Octahedron"))
				sum=sum+8;
			if(str.equalsIgnoreCase("Dodecahedron"))
				sum=sum+12;
			if(str.equalsIgnoreCase("Icosahedron"))
				sum=sum+20;
		}
		System.out.println(sum);
		sc.close();
	}

}
