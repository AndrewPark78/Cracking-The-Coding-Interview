package com.deepak.ctci.Ch01_Arrays_And_Strings;

import java.util.ArrayList;

public class Problem_03 {

	public static Object replaceSpacesWithSpecialCharacter(String string, int i) {
		char[] special = string.toCharArray();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int j = 0; j < special.length; j++) {
		if(special[j] == ' ') {
			nums.add(j);
		}
		}
		String fixed = special.toString();
		String hold = fixed;
		String hold1 = fixed;
		for(int k: nums) {
			fixed.substring(0,k);
			fixed = fixed + "%20";
			fixed = hold.substring(k+1, hold.length()-1);
			hold = hold1;
		}
		
		return fixed;
	}

}
