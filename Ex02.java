package week04_day3;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		for(int i=0; i< args.length; i++) {
			int number = Integer.parseInt(args[i]); //"125" => 125 "hello" -> 숫자로변환
			sum = sum + number;
			
//			System.out.println(args[i]);
			
		}
		
		System.out.println("합계="+ sum);
		
		
		String price = "25000";
		
		int result = Integer.parseInt(price);
		int point = (int)(result *0.01);
		System.out.println(result*0.01);
	}

}
