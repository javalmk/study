package lmk.calender;

import java.util.Scanner;

public class Calender {

	private final int[] ARR = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int a) {
		return ARR[a - 1];
	}

	public void printSampleCalender() {
		System.out.println("일   월   화   수   목   금   토");
		System.out.println("---------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Calender cal1 = new Calender();
		System.out.println("반복횟수를 입력하세요");
		int repeat = scanner.nextInt();

		for (int i = 0; i < repeat; i++) {

			System.out.println("달을 입력하세요 : ");
			int a = scanner.nextInt();
			System.out.printf("%d월의 최대일수는 %d 입니다.\n", a, cal1.getMaxDaysOfMonth(a));

		}
		// cal1.printSampleCalender();
		System.out.println("bye");
		scanner.close();

	}

}
