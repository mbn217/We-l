package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 try {
			FileInputStream fin=new FileInputStream("D:\\testout.txt");
			System.out.println("This is a correct File");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			System.out.println("somthging is wrong");
		}    
		
		
		
		 
		 
		 
		 
		 
		
		

	}
	
	
	

}
