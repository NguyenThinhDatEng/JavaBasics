// Given a string s and an integer k
// Write a program that accepts these two variables from the user and prints the k'th character in s
import java.util.Scanner;

public class GetUsedToString{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		System.out.print(s.charAt(k - 1));
	}
}
