package StaticArrays;

import java.util.Iterator;

public class NamesTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

									
		String [] names = {"Ammar ben salah Jlasi","Mohamed Nheri", "Carol Jackeline Flores", "Wael Dhiflaoui", "Beya Nicole Dhiflaoui"};
		
		for (int i = 0; i < names.length; i++) {
			//System.out.println(names[i]);
			String[] mynewArray = names[i].split(" "); //we split the element by spaces
			
			if (mynewArray.length>=3) {
				System.out.println(names[i]);
			}
			
		}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
