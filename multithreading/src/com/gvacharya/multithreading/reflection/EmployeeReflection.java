package com.gvacharya.multithreading.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class EmployeeReflection {

	public static void main(String[] args) {
		
		Class<Employee> empReflection = Employee.class;
		
		try {
			Employee employee = empReflection.getDeclaredConstructor().newInstance();
			employee.setEmpId(20);
			employee.setEmpName("Kunal");
			System.out.println(employee);
			
			Method[] methods = empReflection.getDeclaredMethods();
			for(Method method:methods)
				System.out.println(method.getName());
			
			Field[] fields = empReflection.getDeclaredFields();
			for(Field field:fields)
				System.out.println(field.getName());
			
			Method SetEmpId = empReflection.getDeclaredMethod("setEmpId", Integer.class);
			SetEmpId.invoke(employee, 21);
			System.out.println(employee);
			
			Method empNameMethod = empReflection.getDeclaredMethod("setEmpName", String.class);
			empNameMethod.invoke(employee, "Rohan");
			System.out.println(employee);
			
			Field field = empReflection.getDeclaredField("empId");
			field.setAccessible(true);
			field.set(employee, 30);
			System.out.println(employee);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
