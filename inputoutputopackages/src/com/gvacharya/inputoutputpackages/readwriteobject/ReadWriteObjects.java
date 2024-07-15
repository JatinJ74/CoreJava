package com.gvacharya.inputoutputpackages.readwriteobject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import com.gvacharya.inputoutputpackages.readwriteobject.entities.Employee;

public class ReadWriteObjects {

	public static void main(String[] args) {
		Employee[] emp1 = new Employee[5]; 
		emp1[0] = new Employee(1,"Jatin");
		emp1[1] = new Employee(2,"Rohit");
		emp1[2] = new Employee(3,"Mohit");
		emp1[3] = new Employee(4,"Rohan");
		emp1[4] = new Employee(5,"Purohit");
 		
		try(
				FileOutputStream fis = new FileOutputStream("student1.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fis);
				
				){
//				System.out.println("");
				
				oos.writeObject(emp1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(	
//				FileInputStream fis = new FileInputStream("Student.txt");
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student1.txt"));
				
				){
			
			try {
				Employee[] emp3 = (Employee[]) ois.readObject();
				System.out.println(Arrays.toString(emp3));
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
