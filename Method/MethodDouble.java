import java.util.Scanner;

public class MethodDouble {
	public static double circumference(double r)
	{
		return 3.14*r*2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		System.out.print(circumference(r));
	}
}