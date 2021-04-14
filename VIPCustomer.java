package week04_day3_customer;

public class VIPCustomer extends Customer {

	int agentId;
	double saleRatio;
	
	
	public VIPCustomer() {
		
	}
	public VIPCustomer(int id, String name, String grade, double ratio) {
		super(id, name, grade, ratio);
		agentId=100;
		saleRatio=0.1;
		
	}
	public void calcPoint(int price) {
		int price_point =(int)(price*ratio)+10000;
		point+=price_point;
	}
}
