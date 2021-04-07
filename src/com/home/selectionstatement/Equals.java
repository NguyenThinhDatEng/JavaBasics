package com.home.selectionstatement;

import java.util.Scanner;

public class Equals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name01 = sc.next();
		String name02 = sc.next();
		if(name01.equals(name02)) System.out.println("two people have the same name");
		else
			System.out.println("two people don't have the same name");
	}
}