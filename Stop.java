package week04_day2_overriding_Car;

public class Stop extends Car{
	
	
	@Override
	public void process(  ) {
		System.out.println("사용자의 3M 반경에 도착하면 차량이 정지합니다");
		System.out.println("차량의 문이 열립니다");
		System.out.println("안전벨트 경보음이 울립니다");
		System.out.println("목적지를 설정합니다");
}
}


