package com.gvacharya.multithreading.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StudentReflection {

	public static void main(String[] args) {
		Class<Student> classStudent1 = Student.class;
		
		try {
			Student student = classStudent1.getDeclaredConstructor().newInstance();
			student.setName("ABC");
			student.setRollNo(10);
			System.out.println(student);
			
			
			
			Method[] methods = classStudent1.getDeclaredMethods();
			for(Method method:methods)
				System.out.println(method.getName());
			
			
			Field[] fields = classStudent1.getDeclaredFields();
			for(Field field:fields)
					System.out.println(field.getName());
			
			
			Method setName= classStudent1.getDeclaredMethod("setName",String.class);
			setName.invoke(student, "BBC");
			System.out.println(student);
			
			Method setRollNo = classStudent1.getDeclaredMethod("setRollNo",Integer.class);
			setRollNo.invoke(student,20);
			System.out.println(student);
			
			try {
				Field rollNo = classStudent1.getDeclaredField("rollNo");
				rollNo.setAccessible(true);
				rollNo.set(student, 230);
				
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			}
			
			try {
				Field name = classStudent1.getDeclaredField("name");
				name.setAccessible(true);
				name.set(student, "Kunal");
//				System.out.println(student);
				
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			}
			
			
			Method toStringPrivate = classStudent1.getDeclaredMethod("toStringOne",Integer.class,String.class);
			toStringPrivate.setAccessible(true);
			toStringPrivate.invoke(student, 36,"Jatin");
			System.out.println(student);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}

