package com.home.loop;

// an integer n from the user and prints all even numbers from n to 100 on the screen
import java.util.Scanner;

public class WHILE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n <= 100) {
			if (n % 2 != 0) n = n + 1; 
			System.out.print(n + " ");
			n += 2;
		}
	}
}
