package test.main;

public class MainClass03 {
	
	public static void main(String[] args) {
		//���ο� ������ ���� ��Ű�� 
		new YourThread().start();
		new YourThread().start();
		new YourThread().start();
	}
	
	static class YourThread extends Thread{
		@Override
		public void run() {
			System.out.println("���ο� ������");	
		}
	}
}
