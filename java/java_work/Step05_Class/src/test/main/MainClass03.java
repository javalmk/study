package test.main;

import test.mypac.Car;
import test.mypac.MyUtil;

public class MainClass03 {
	public static void main(String[] args) {
		//1. MyUtil Ŭ������ sendMessage() �޼ҵ带 ȣ���� ������.
		MyUtil.sendMessage();
		//2. MyUtil Ŭ������ version �̶�� �ʵ忡 �����
		//   ���ڿ��� �ֿܼ� ����� ������.
		System.out.println(MyUtil.version);
		//3. Car Type ��ü�� �����ؼ� drive() �޼ҵ带 ȣ���� ������.
		Car car1=new Car();
		car1.drive();
		//4. ������ ���� Car Type ��ü�� name �ʵ忡 �����
		//   ���ڿ��� �ܼ�â�� ����� ������.
		System.out.println(car1.name);
	}
}







