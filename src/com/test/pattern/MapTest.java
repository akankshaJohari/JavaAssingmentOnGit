package com.test.pattern;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	
	
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		map.put(10, null);
		
		System.out.println(map);
		Integer a = map.computeIfAbsent(10, x->1);
		
		System.out.println(map);
	}
	
	
	
}
