package mypackage;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Jay");
		hm.put(2, "Mendu");
		hm.put(3, "Mary");
		hm.put(0, null);
		hm.put(null, null);
		
		System.out.println("\nThe elements of the HashMap are:");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		//HashTable
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		
		ht.put(4, "Karthik");
		ht.put(5, "Salman");
		ht.put(6, "Ajit");
		ht.put(7, "Naim");
		
		System.out.println("\nThe elements of Hashtable are:");
		for(Map.Entry n:ht.entrySet()) {
			System.out.println(n.getKey()+"    "+n.getValue());
		}
		
		//TreeMap
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(8, "kumar");
		map.put(9, "Soni");
		map.put(10, "Mohan");
		map.put(11, "Shubaan");
		map.put(4, null);
		//map.put("ABC", "ABC");
		map.put(8, "utkarsh");
		
		System.out.println("\nThe elements of TreeMap are:");
		for(Map.Entry l:map.entrySet()) {
			System.out.println(l.getKey()+"     "+l.getValue());
		}
		
	}

}
