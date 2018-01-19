package lmk.calender;

import java.util.Scanner;

public class SumTest {
	public static void main(String[] args) {
		int a, b;
		System.out.println("두수의 합은 :");
		Scanner scanner = new Scanner(System.in);
		String s1= scanner.next();
		String s2= scanner.next();
		
		a= Integer.parseInt(s1);
		b= Integer.parseInt(s2);
		System.out.printf("%d와  %d의 합은 %d 이다", a, b, (a+b));
		scanner.close();
	}
}
