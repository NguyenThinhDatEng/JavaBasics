// Viết chương trình nhập vào tên của 2 người, bạn hãy kiểm tra xem tên của 2 người này có giống nhau không
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