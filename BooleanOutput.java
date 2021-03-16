// a và b kiểu số nguyên 
// true nếu a lớn hơn b, ngược lại hiển thị ra false
import java.util.Scanner;

public class BooleanOutput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// boolean
		System.out.print(a > b);
	}
}