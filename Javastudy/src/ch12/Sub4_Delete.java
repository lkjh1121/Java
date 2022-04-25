package ch12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 날짜 : 2022/01/13
 * 이름 : 김재현
 * 내용 : 자바 DELETE FROM 실습하기 교재 p
 */
public class Sub4_Delete {
	public static void main(String[] args) {
		
		// JDBC 접속 테스트
		final String HOST = "jdbc:mysql://54.180.160.240:3306/alskejdtod";
		final String USER = "alskejdtod";
		final String PASS = "1234";

		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");	
		
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);

	
			// 3단계 - SQL실행 객체생성(Statement)
			Statement stmt = conn.createStatement();
			
			// 4단계 - SQL실행
			String sql = "DELETE FROM `User1` WHERE `uid`='P101';"; 
			int count = stmt.executeUpdate(sql);
	
			System.out.println(count+"개의 데이터가 추가되었습니다.");
		
			// 5단계 - 결과처리(SELECT일 경우)
			// 6단계 - 데이터베이스 종료
			conn.close();
	
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Isert 완료...");
	
	}
}