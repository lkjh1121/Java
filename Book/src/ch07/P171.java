package ch07;

public class P171 {
	
	public static void main(String[] args) {
		
		Student stu1 = new Student(); // 1�� ������
		Student stu2 = new Student("ȫ�浿") // 2�� ������
		Student stu3 = new Student("ȫ�浿", 4) // 3�� ������
		Student stu4 = new Student("ȫ�浿",4, "����Ʈ�������") // 4�� ������
		
	}
}

// �ʵ�
	String name; // �л���
	int grade; // �г�
	String department; // �а�
		
	// 1�� ������
	Student(){
			
	}
	
	// 2�� ������
	Student(String n) {
		name = n;
	}
		
	// 3�� ������
	Student(String n, int g) {
		name = n;
		grade = g;
	}
		
	// 4�� ������
	Student(String n, int g, String d) {
		name = n;
		grade = g;
		department = d;
		
		
	}
}
