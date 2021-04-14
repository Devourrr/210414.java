package week04_day3_customer;

public class Customer {

	int id; // 고객아이디
	String name ; //이름
	String grade; //등급
	double ratio; // 적립비율
	int point; //적립금
	
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
	//메서드
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
