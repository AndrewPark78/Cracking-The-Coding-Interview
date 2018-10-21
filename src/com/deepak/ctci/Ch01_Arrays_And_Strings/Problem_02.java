package com.deepak.ctci.Ch01_Arrays_And_Strings;

import java.util.Arrays;

public class Problem_02 {

	public static boolean isValidPermutation_BruteForce(String string, String string2) {
		boolean isPermutation = false;
		char[] c1 = string.toCharArray();
		char[] c2 = string2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		for (int i = 0; i < c2.length; i++) {
			if(c1[i] != c2[i]) {
				return isPermutation;
			}
		}
		
		isPermutation = true;
		return isPermutation;
	}

}
