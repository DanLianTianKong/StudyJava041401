package com.fuxi01;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class Review {

	public static void main(String[] args) {
		HashMap< String, Integer> compare = new LinkedHashMap<String, Integer>();
		
		compare.put("zhangsan", 20);
		compare.put("zhangsan", 20);
		
		String str1 = "xxx";
		String str2 = "xxx";
		String str3 = "xxx";
		
		List<String> list = new LinkedList<String>();
		
		list.add(str1);
		list.add(str2);
		//list.add(str3);
		
		if (list.contains(str3)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		

	}

}
