package ch07;

public class P169 {
	

	public static void main(String[] args) {
		
	Student stu = new Student("홍길동", 4, "소프트웨어공학");

	System.out.println(stu.name);
	System.out.println(stu.grade);
	System.out.println(stu.department);
	
	Student stu2 = new Student("이순신", 3, "디자인");
	
	System.out.println(stu.name);
	System.out.println(stu.grade);
	System.out.println(stu.department);
	

	// 기본 생성자로 객체 생성
	Student stu0 = new Student(); // 에러발생
	
	//필드
	String name; // 학생명
	int grade; // 학년
	String department; // 학과
	
	Student(String n, int g, String  d) {

		name = n;
		grede = g;
		department = d;
	}
	
	// 기본 생성자
	Student() {
		
	}
}
