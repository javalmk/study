package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass03 {
	public static void main(String[] args) {
		InputStream is=System.in;
		InputStreamReader isr=new InputStreamReader(is);
		//InputStreamReader ��ü�� �������� �������� ���ڷ� 
		//�����ϸ鼭BufferedReader ��ü �����ϱ�
		BufferedReader br=new BufferedReader(isr);
		try {
			System.out.print("���� �Է�:");
			//���ڿ� ���� �Է� �ޱ� 
			String line=br.readLine();
			System.out.println("- �Է��� ���ڿ� -");
			System.out.println(line);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}








