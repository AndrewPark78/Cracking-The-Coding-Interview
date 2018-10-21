package com.deepak.ctci.Ch01_Arrays_And_Strings;

public class Problem_01 {

	public static boolean hasUniqueAscii(String string) {
		// TODO Auto-generated method stub
		boolean isUnique = false;
		try {
		char[] str = string.toCharArray();
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				if(i != j) {
					if(str[i] == str[j]) {
						return isUnique;
					}
				}
			}
		
		}
	}catch(NullPointerException e) {
		return false;
	}
		isUnique = true;
		return isUnique;
	}

	public static boolean hasUniqueUnicode(String string) {
		// TODO Auto-generated method stub
		boolean isUnique = false;
		try {
		char[] str = string.toCharArray();
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				if(i != j) {
					if(str[i] == str[j]) {
						return isUnique;
					}
				}
			}
		
		}
	}catch(NullPointerException e) {
		return false;
	}
		isUnique = true;
		return isUnique;
	}
	}


