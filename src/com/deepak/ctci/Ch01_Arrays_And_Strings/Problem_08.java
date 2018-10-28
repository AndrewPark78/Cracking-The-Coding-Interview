package com.deepak.ctci.Ch01_Arrays_And_Strings;

import java.util.HashMap;
import java.util.Iterator;

public class Problem_08 {

	public static int[][] setZeros(int[][] matrix) {
		HashMap<Integer, Integer> location = new HashMap<>();
		for (int rows = 0; rows < matrix.length; rows++) {
			for (int col = 0; col < matrix[0].length; col++) {
				if (matrix[rows][col] == 0) {
					location.put(rows, col);
				}
			}
		}
		int[][] temp = matrix;
		for (Integer r : location.keySet()) {
			for (int col1 = 0; col1 < matrix[0].length; col1++) {
				temp[r][col1] = 0;
			}
		}
		for (Integer c : location.values()) {
			for (int rows1 = 0; rows1 < matrix.length; rows1++) {
				matrix[rows1][c] = 0;
			}
		}
		for (int rows2 = 0; rows2 < matrix.length; rows2++) {
			for (int col2 = 0; col2 < matrix[0].length; col2++) {
				if (temp[rows2][col2] == 0) {
					matrix[rows2][col2] = 0;
				}
			}
		}

		return matrix;
	}

}
