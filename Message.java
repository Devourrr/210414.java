package week04_day2_overriding_Car;



public class Message extends Car{
	
	
	
	public Message(String time, String place) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void  process(  String time, String place ) {
		System.out.println(time + ", " + place + "으로 차량 호출");
		
}
}


