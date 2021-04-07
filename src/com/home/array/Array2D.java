package com.home.array;
import java.util.*;

public class Array2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // enter the number of rows
		int m = sc.nextInt(); // input the column number
		int[][] arr = new int[n][m]; // declare array2 with n rows and m columns
		int sum = 0; // is sum of all elements in array
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				// initialize the value of element in the array
				arr[i][j] = sc.nextInt();
				sum += arr[i][j];
			}
		}
		System.out.print(sum);
	}
}