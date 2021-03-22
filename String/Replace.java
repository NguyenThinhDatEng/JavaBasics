// Write a program that accepts a string s from the user and displays non-numeric characters in s on the screen
import java.util.Scanner;

public class Replace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for (int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if (c >= '0' && c <= '9') s = s.replace(c + "", ""); 
		}
		System.out.print(s);
	}
}