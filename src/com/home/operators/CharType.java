package com.home.operators;

import java.util.Scanner;

public class CharType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = (char)(sc.next().charAt(0) + 1);
		System.out.println(c);
	}
}

/* Way 2
 char c=sc.next().charAt(0);
 System.out.println((char)(c+1));;
*/
