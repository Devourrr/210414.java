package week04_day3;

public class Student {

	//멤버변수 (인스턴스 변수)
	int id;
	String name;
	static int cnt; //(클래스 변수)
	
	//생성자
	public Student() {
		cnt++;
		id=cnt;
		name="아무개학생";
	}
	public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	//메서드, 멤버메서드 (인스턴스 메서드)
	public void dispinfo() {
		System.out.println(id + name);
		
	}
	//메서드 , 클래스메서드
	public static void printStar() {
		System.out.println("*********");
		
	}
}
