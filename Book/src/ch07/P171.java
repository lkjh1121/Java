package ch07;

public class P171 {
	
	public static void main(String[] args) {
		
		Student stu1 = new Student(); // 1번 생성자
		Student stu2 = new Student("홍길동") // 2번 생성자
		Student stu3 = new Student("홍길동", 4) // 3번 생성자
		Student stu4 = new Student("홍길동",4, "소프트웨어공학") // 4번 생성자
		
	}
}

// 필드
	String name; // 학생명
	int grade; // 학년
	String department; // 학과
		
	// 1번 생성자
	Student(){
			
	}
	
	// 2번 생성자
	Student(String n) {
		name = n;
	}
		
	// 3번 생성자
	Student(String n, int g) {
		name = n;
		grade = g;
	}
		
	// 4번 생성자
	Student(String n, int g, String d) {
		name = n;
		grade = g;
		department = d;
		
		
	}
}
