package week04_day2_overriding_Car;

public class Pass extends Car{
	
	

	
	@Override
	public void process( ) {
		
		System.out.println("시동을 켜고 비상등을 점등합니다");
		System.out.println("여름일 경우 에어컨을 작동합니다");
		System.out.println("겨울일 경우 열선을 작동합니다");
		System.out.println("차량이 사용자가 있는 곳으로 이동합니다");
		
		
}
}


