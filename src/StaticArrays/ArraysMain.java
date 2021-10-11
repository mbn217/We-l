package StaticArrays;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraysMain {

	public static void main(String[] args) {
		
//		
//		//Static Array
//		String [] names = {"Mohamed", "wael",null};
//		names[1]="Sophia";
//		//System.out.println(names[2]);
//		
//		for (int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);
//		}
//		
//		
//		
//		
//		
//		System.out.println("++++++++++++++++");
//		System.out.println("++++++++++++++++");
//		//Dynamic Array  .. ArrayList
//		
		ArrayList<String> names2 = new ArrayList<>();
		names2.add("Wes"); //0
		names2.add("Jerry"); //1
		

		//int counter = 0;
		for (int i = 0; i < names2.size(); i++) {
			System.out.println(names2.get(i));
			if (names2.get(i).equals("Wes")) {
				System.out.println("I have found wes");
				break;
			}
			//System.out.println(counter);
			//counter++;
			System.out.println("Hi");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
