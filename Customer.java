package week04_day3_customer;

public class Customer {

	int id; // �����̵�
	String name ; //�̸�
	String grade; //���
	double ratio; // ��������
	int point; //������
	
	public Customer() {
		
		grade="BRONZ";
		ratio=0.01;
	}
	
	public Customer(int id, String name, String grade, double ratio) {
		
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.ratio = ratio;
	}
	//�޼���
	public void calcPoint(int price) {
		
		int price_point = (int)(price * ratio);
		point += price_point;
//		point += (int)(price * ratio);
		
	}
	
	public String getInfo() {
		return id + " " + name + " " + grade + " " + point ;
		
	}
//	//setters, getters
//	public int getId() {
//		return id;
//	}
//	
//	public void setId(int id) {
//		this.id = id;
//	}
	
}
