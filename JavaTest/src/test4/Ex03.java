package test4;
/*
 * 날짜 : 2022/01/12
 * 이름 : 김재현
 * 내용 : String 클래스 연습문제
 */
public class Ex03 {

	public static void main(String[] args) {

		String fileName = "자바 수행평가.hwp";
		
		int idx = fileName.lastIndexOf(".");
		
		String title = fileName.substring(0, idx);
		String ext   = fileName.substring(idx+1);
		
		System.out.println("파일명 : "+title);
		System.out.println("확장자 : "+ext);
	}	
}
