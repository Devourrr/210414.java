package week04_day3_customer;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Doctor doctor = new Doctor();
		doctor.sleep();
		doctor.treat();
		
		//Person person = new Doctor();
		Person person;
		person = doctor;
		
//		person.treat(); //부모형 참조변수로 담는 것은 ok 그러나 의미 축소
		//treat()호출 불가
		
		doctor.sleep();
		person.sleep();
		
		
		
		
	}

}
