package ch12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * ��¥ : 2022/01/13
 * �̸� : ������
 * ���� : �ڹ� DELETE FROM �ǽ��ϱ� ���� p
 */
public class Sub4_Delete {
	public static void main(String[] args) {
		
		// JDBC ���� �׽�Ʈ
		final String HOST = "jdbc:mysql://54.180.160.240:3306/alskejdtod";
		final String USER = "alskejdtod";
		final String PASS = "1234";

		try {
			// 1�ܰ� - JDBC ����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");	
		
			// 2�ܰ� - �����ͺ��̽� ����
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);

	
			// 3�ܰ� - SQL���� ��ü����(Statement)
			Statement stmt = conn.createStatement();
			
			// 4�ܰ� - SQL����
			String sql = "DELETE FROM `User1` WHERE `uid`='P101';"; 
			int count = stmt.executeUpdate(sql);
	
			System.out.println(count+"���� �����Ͱ� �߰��Ǿ����ϴ�.");
		
			// 5�ܰ� - ���ó��(SELECT�� ���)
			// 6�ܰ� - �����ͺ��̽� ����
			conn.close();
	
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Isert �Ϸ�...");
	
	}
}