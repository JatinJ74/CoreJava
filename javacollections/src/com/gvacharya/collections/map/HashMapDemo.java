package com.gvacharya.collections.map;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> pincodeMap = new HashMap<>();
		
		//add data
		// iterating over data
		// method
		
		//list, set, queue - add()
		// map - put()
		
		pincodeMap.put(421306, "Kalyan");
		pincodeMap.put(400070, "Chembur East");
		pincodeMap.put(400612, "Thane");
		pincodeMap.put(421301, "Kalyan West");
		pincodeMap.put(400089, "Chembur");
		pincodeMap.put(null, "India");
		pincodeMap.put(null, "India1");
		// if key are same for more than one keyvalue pair then value will be replaced with later key's value.
		
		// to iterate through key
		for(Integer pincode:pincodeMap.keySet())
			System.out.println(pincode);
		// to iterate through values
		for(String cities:pincodeMap.values())
			System.out.println(cities);
//		
//		// to iterate through entries
		for(Map.Entry<Integer, String> entry:pincodeMap.entrySet())
			System.out.println(entry);
		
		// foreach
		pincodeMap.keySet().forEach(System.out::println);
		pincodeMap.values().forEach(System.out::println);
		pincodeMap.entrySet().forEach(System.out::println);
		
		//stream api
		//keyset
		try(
				Stream<Integer> pincodeStream = pincodeMap.keySet().stream();
 				
				){
				
				pincodeStream.forEach(System.out::println);
			
		}
		//values
		try(
				Stream<String> cityStream = pincodeMap.values().stream();
				
				){
			
			cityStream.forEach(System.out::println);
			
		}
		//entrysEt
		try(
				Stream<Map.Entry<Integer,String>> entryStream = pincodeMap.entrySet().stream();
				
				){
			
			entryStream.forEach(System.out::println);
			
		}
//		
		//using iterator
		//keyset
		
		Iterator<Integer> pinIterator  = pincodeMap.keySet().iterator();
		
		while(pinIterator.hasNext())
			System.out.println(pinIterator.next());
		//values
		Iterator<String> cityIterator  = pincodeMap.values().iterator();
		
		while(cityIterator.hasNext())
			System.out.println(pinIterator.next());
		//entrySet
		Iterator<Map.Entry<Integer, String>> entryIterator  = pincodeMap.entrySet().iterator();
		
		while(entryIterator.hasNext())
			System.out.println(pinIterator.next());
		
		Enumeration<Integer> pinEnum = Collections.enumeration(pincodeMap.keySet());
		
		while(pinEnum.hasMoreElements())
			System.out.println(pinEnum.nextElement());
		
		pincodeMap.compute(400074, (k,v) -> v.toUpperCase());
		
		System.out.println(pincodeMap.get(400070));
		
		pincodeMap.computeIfAbsent(400612, Integer::toBinaryString);
		
//		System.out.println(pincodeMap.get(400612));
		// common methods - > hashmap, linkedHashMap, TreeMap
		//keySet
		//put
		//values
		//entrySet
		//putifabsent
		//compute
		
		
	}
}
