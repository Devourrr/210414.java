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
		
//		person.treat(); //�θ��� ���������� ��� ���� ok �׷��� �ǹ� ���
		//treat()ȣ�� �Ұ�
		
		doctor.sleep();
		person.sleep();
		
		
		
		
	}

}
