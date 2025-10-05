package tp2;

import java.util.Scanner;

public class exercice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez n : ");
		int n = sc.nextInt();
		int[][] m = new int[n][n];
		int val = 1, top = 0, bottom = n - 1, left = 0, right = n - 1;

		while (val <= n * n) {
			for (int i = left; i <= right; i++)
				m[top][i] = val++;
			top++;
			for (int i = top; i <= bottom; i++)
				m[i][right] = val++;
			right--;
			for (int i = right; i >= left; i--)
				m[bottom][i] = val++;
			bottom--;
			for (int i = bottom; i >= top; i--)
				m[i][left] = val++;
			left++;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
		}

		sc.close();
	}
}
