package com.deepak.ctci.Ch01_Arrays_And_Strings;

import java.util.ArrayList;

public class Problem_06 {

	public static String compressString(String string) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<Character> ch = new ArrayList<Character>();
		for (int i = 0; i < string.length(); i++) {
			if(i == 0) {
				ch.add(string.charAt(i));
			}else {
				if(string.charAt(i) == string.charAt(i-1)) {
					nums.set(nums.size()-1, nums.get(nums.size()-1)+1);
				}
			}
		}
		String fin = "";
		for (int i = 0; i < ch.size(); i++) {
			fin = ch.get(i) + nums.get(i) + "";
		}
		return fin;
	}

}
