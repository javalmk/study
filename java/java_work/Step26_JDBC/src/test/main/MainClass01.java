package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass01 {
	public static void main(String[] args) {
		//�ʿ��� ��ü�� ���� ���� �����
		Connection conn=null;
		try{
			//����Ŭ ����̹� �ε��ϱ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//������ oracle DB url ����
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			//Connection ��ü�� ������ ������
			conn=DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Oracle DB ���� ����!");
		}catch(Exception e){
			e.printStackTrace();
		}
		//�ʿ��� ��ü�� ���� ���� ����� 
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			//������ sql �� �غ� 
			String sql="SELECT num, name, addr FROM member";
			//PreparedStatement ��ü�� ������ ������
			//(sql ���� ��� �������� ��ü)
			pstmt=conn.prepareStatement(sql);
			//ResultSet ��ü�� ������ ������ 
			//(SELECT ���� ���� ��� ���� ������ �ִ� ��ü)
			rs=pstmt.executeQuery();
			//�ݺ��� ���鼭 cursor �� ��ĭ�� ������. 
			while(rs.next()){
				//���� cursor �� ��ġ�� ���� 
				//row ���� ���ϴ� Į���� �����͸� ���´�.
				int  num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				System.out.println(num+"/"+name+"/"+addr);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e){}
		}//try
	}
}













