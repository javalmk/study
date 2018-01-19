package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;
import test.mypac.YourRemocon;

public class MainClass03 {
	public static void main(String[] args) {
		// local inner class
		class OurRemocon implements Remocon{
			@Override
			public void up() {
				System.out.println("ä���� �÷���!");
			}
			@Override
			public void down() {
				System.out.println("ü���� ������!");
			}
		}
		//OurRemocon ��ü �����ؼ� Remocon �������̽� type ����
		//������ �ޱ� 
		Remocon r1=new OurRemocon();
		
		useRemocon(r1);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}











