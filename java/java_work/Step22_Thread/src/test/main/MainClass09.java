package test.main;

public class MainClass09 {
	public static void main(String[] args) {
		
		final String name="�豸��";
		
		// local inner class �� �̿��ؼ� ������ ���� ��Ű�� 
		new Thread(new Runnable() {
			@Override
			public void run() {
				//���������� final ����� ���� �����ϴ� 
				System.out.println("�������� name:"+name);
			}
		}).start();
	}
}







