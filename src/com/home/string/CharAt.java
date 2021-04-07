package com.home.string;
// Given a string s and a character c
// Write a program that accepts these two variables from the user and prints the occurrences of character c in s
import java.util.Scanner;

public class CharAt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c = sc.next().charAt(0);
		int count = 0;
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == c) count++;
		}
		System.out.print(count);
	}
}
