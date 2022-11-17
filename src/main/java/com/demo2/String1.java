package com.demo2;

import java.util.HashMap;

public class String1 {

	public class wordCount {
		public static void main(String[] args) {
			String str = "java is simple langauge";
			String[] split = str.split(" ");
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			for (int i = 0; i < split.length; i++) {
				if (map.containsKey(split[i])) {
					int count = map.get(split[i]);
					map.put(split[i], count + 1);
				} else {
					map.put(split[i], 1);
				}
			}
			System.out.println(map);
		}
	}

}
