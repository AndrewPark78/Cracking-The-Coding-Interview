package com.deepak.ctci.Ch01_Arrays_And_Strings;

import java.util.Arrays;

public class Problem_091 {

	public static boolean isRotation(String string, String string2) {
		if (string == null || string2 == null) {
			return false;
		}
		if(string.length() != string2.length()) {
			return false;
		}
		
		String st = string + string;
		if(st.contains(string2)) {
			return true;
		}
		return false;
	}

}
