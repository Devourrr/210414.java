package week04_day3;

public class Student {

	//������� (�ν��Ͻ� ����)
	int id;
	String name;
	static int cnt; //(Ŭ���� ����)
	
	//������
	public Student() {
		cnt++;
		id=cnt;
		name="�ƹ����л�";
	}
	public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	//�޼���, ����޼��� (�ν��Ͻ� �޼���)
	public void dispinfo() {
		System.out.println(id + name);
		
	}
	//�޼��� , Ŭ�����޼���
	public static void printStar() {
		System.out.println("*********");
		
	}
}
