package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class MainClass05 {
	public static void main(String[] args) {
		OutputStream os=System.out;
		//OutputStreamWriter ��ü ���� 
		OutputStreamWriter osw=new OutputStreamWriter(os);
		try {
			//String ��� 
			osw.write("���ڿ� ���");
			//����
			osw.flush();
			//char[] ��ü ���� 
			char[] chars={'��','��','��','��'};
			//char[] ��� 
			osw.write(chars);
			osw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}






