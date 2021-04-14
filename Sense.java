package week04_day2_overriding_Car;



public class Sense extends Car{
	
		
		@Override
		public void process(  ) {
			System.out.println("주변차량을 감지합니다");
			System.out.println("보행자를 감지합니다");
			System.out.println("차량출동위험을 피해 이동합니다");
			System.out.println("장애물을 피해 이동합니다");
			System.out.println("보행자를 인식하며 조건에 따라 이동합니다");
	}
}
