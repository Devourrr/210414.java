package week04_day3_customer;

public class Test {
	
	public static void main(String[] args ) {
		VIPCustomer vipcustomer = new VIPCustomer(200101,"±Ë∞Ì∞¥","VIP",0.05);
		System.out.println(vipcustomer.getInfo());
		
		vipcustomer.calcPoint(500000);
		vipcustomer.calcPoint(100000);
		
		System.out.println(vipcustomer.getInfo());
		
		System.out.println("=================");
		/// 
		Customer customer = new Customer(201, "¿Ã∞Ì∞¥","BRONZ",0.01);
				
		customer.calcPoint(500000);
		customer.calcPoint(100000);
		
		System.out.println(vipcustomer.getInfo());
		
		Customer[] arr = new Customer[2];
		arr[0] = new VIPCustomer(200101,"±Ë∞Ì∞¥","VIP",0.05);
		arr[1] = new Customer(201,"¿Ã∞Ì∞¥","BRONZ",0.01);
		
		for(int i=0; i<arr.length; i++) {
			arr[i].calcPoint(500000);
			arr[i].calcPoint(100000);
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].getInfo());
			
		}
	}

}
