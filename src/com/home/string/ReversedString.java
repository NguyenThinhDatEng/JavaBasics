package com.home.string;
// Given a string s
// Write a program that accepts s from the user and reverses s. Display the reversed string on the screen
import java.util.Scanner;

public class ReversedString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String str = "";
		for (int i = s.length() - 1; i >= 0; i--)
		{
			str += s.charAt(i);
		}
		System.out.print(str);
	}
}