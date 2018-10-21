package com.deepak.ctci.Ch01_Arrays_And_Strings;

public class Problem_05 {

	public static boolean isOneEditAway(String string, String string2) {
		char[] c1 = string.toCharArray();
		char[] c2 = string2.toCharArray();
		int errors = 0;
		for (int i = 0; i < c2.length; i++) {
			if(c1[i] != c2[i]) {
				errors++;
			}
		}if(errors == 1) {
			return true;
		}
		return false;
	}

}
