package codeup;

import java.util.Scanner;

public class codeup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int day = 1;
		
		
		while(day%a!=0 || day%b!=0 || day%c!=0) day++;
		
		System.out.printf("%d", day);
	}

}
