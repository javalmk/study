package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		//�͸��� local inner Ŭ������ �̿��ؼ� ������ ���۽�Ű��
		new Thread() {
			@Override
			public void run() {
				System.out.println("���ο� ������ ���۵�");
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				System.out.println("���� ���");
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				System.out.println("�뷡�� �ҷ���");
			}
		}.start();
	}
}






