package tp2;

import java.util.Scanner;

public class exercice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez les nombres  :");
		String[] input = sc.nextLine().split(" ");
		int n = input.length;
		int[] t = new int[n];

		for (int i = 0; i < n; i++) {
			t[i] = Integer.parseInt(input[i]);
		}

		System.out.print("Pivots : ");
		for (int i = 0; i < n; i++) {
			boolean gaucheOK = true;
			boolean droiteOK = true;
			for (int j = 0; j < i; j++) {
				if (t[j] > t[i]) {
					gaucheOK = false;
					break;
				}
			}
			for (int j = i + 1; j < n; j++) {
				if (t[j] < t[i]) {
					droiteOK = false;
					break;
				}
			}
			if (gaucheOK && droiteOK) {
				System.out.print(t[i] + " ");
			}
		}
		sc.close();
	}
}
