package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("�����忡�� A �۾�����~");
			}
		}).start();
		
		new Thread(()->{
			System.out.println("�����忡�� B �۾� ����");
		}).start();
	}
}









