
package ch07;

class Student168{
	
	
}

public class P168 {
	
	public static void main(String[] args) {
		  
		Student stu = new Student("ȫ�浿", 4, "����Ʈ�������");
	
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
		
		Student stu2 = new Student("�̼���", 3, "������");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
		

		// �⺻ �����ڷ� ��ü ����
		Student stu0 = new Student(); // �����߻�
		
	}
}