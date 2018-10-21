package com.deepak.ctci.Ch01_Arrays_And_Strings;

import java.util.ArrayList;
import java.util.HashMap;

public class Problem_04 {

	public static boolean isPalindromePermutation(String string) {
		HashMap<Character, Integer> nums = new HashMap<>();
		for (int i = 0; i < string.length(); i++) {
			if(Character.isAlphabetic(string.charAt(i))) {
				nums.put(string.charAt(i), nums.get(string.charAt(i) +1));
			}else {
				nums.put(string.charAt(i), 1);
			}
		}
		int x = 0;
		for(int v: nums.values()) {
			if(v%2 != 0) {
				x ++;
			}
		}
		if(x == 1) {
			return true;
		}
		return false;
	}

}
