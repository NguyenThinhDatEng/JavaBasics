import java.util.Scanner;

public class MethodVoid{
	public static void DivisableBy3Not5(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 3 == 0 && arr[i] % 5 != 0)
				System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		DivisableBy3Not5(arr);
	}
}