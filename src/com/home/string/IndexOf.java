package com.home.string;
// Given two string s1 and s2
// Write a program that prints the position of the first occurrence of s2 in s1
// (uppercase and lowercase letters will be considered as the same letters)
import java.util.Scanner;

public class IndexOf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		s1 = s1.toUpperCase();
		s2 = s2.toUpperCase();
		System.out.print(s1.indexOf(s2));
	}
}