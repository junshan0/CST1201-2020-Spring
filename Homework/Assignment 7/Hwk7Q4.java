package mypackage;

import java.util.Scanner;

public class Hwk7Q4 {
	public static void main(String[] args) {
		int[][] numbers= {
			{4, 56, 28, 93},
			{8, 3, 92, 45, 34},
			{94, 24, 5, 3},
			{4, 5, 6, 9},
		};
		
		System.out.println("The total of row number 1 is " + getRowTotal(numbers,1));
		System.out.println("The total of column number 2 is "+ getColumnTotal(numbers,2));

	}
	
	/**
	 * Get the total of one row in a 2 dimensional array
	 * @param array
	 * @param row
	 * @return
	 */
	public static int getRowTotal(int [][] array, int row) {
		int rowTotal=0;
		// Note that using array[row].length can handle ragged array rows
		for (int cols= 0;cols<array[row].length;cols++) {
			rowTotal += array[row][cols];				
		}
		return rowTotal;		
	}
	
	/**
	 * Get the total of one column in a 2 dimensional array
	 * @param array
	 * @param row
	 * @return
	 */
	public static int getColumnTotal(int [][] array, int col){
		int colTotal=0;
		for (int row = 0; row<array.length; row++) {
			colTotal += array[row][col];
		}
		return colTotal;
	}
}
