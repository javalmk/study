package test.main;

import test.mypac.Car;
import test.mypac.Gura;

/*
 *  [ Ŭ������ ��Ȱ ]
 *  
 *  1. static �ɹ��� ������ �ִ� ��Ȱ
 *  2. ��ü�� ���赵 ��Ȱ
 *  3. Data Type ��Ȱ
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main �޼ҵ尡 ���� �Ǿ����ϴ�.");
		// Car Type ��ü�� �������� ���� �������� ����� 
		Car car1=null;
		// Car ��ü�� �����ϰ� �������� ������ �����ϱ� 
		car1=new Car();
		
		// Gura Type ��ü�� �������� ���� �������� ����� 
		Gura gura1=null;
		// Gura ��ü�� �����ϰ� �������� ������ �����ϱ� 
		gura1=new Gura();
		
		//��ü�� �ʵ� ���� 
		String a = car1.name;
		//��ü�� �޼ҵ� ȣ��
		car1.drive();
	}
}












