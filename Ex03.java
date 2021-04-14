package week04_day3_customer;

import week04_day2_overriding.Animal;
import week04_day2_overriding.Cat;
import week04_day2_overriding.Dog;
import week04_day2_overriding.Wolf;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		Cat cat = new Cat();
//		Dog dog = new Dog();
//		Wolf wolf = new Wolf();
//		
//		cat.bark();
//		dog.bark();
//		wolf.bark();
//		
//		Animal animal1 = new Cat();
//		Animal animal2 = new Dog();
//		Animal animal3 = new Wolf();
//	
//	    animal1.bark();
//	    animal2.bark();
//	    animal3.bark();
//	    
	    
	    Animal[] animals = new Animal[3];
	    animals[0] = new Cat();
	    animals[1] = new Dog();
	    animals[2] = new Wolf();
	    
	    for(int i=0; i<animals.length; i++) {
	    	animals[i].bark();
	    }
	    
	}

}
