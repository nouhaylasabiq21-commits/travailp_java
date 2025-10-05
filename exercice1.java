package tp2;

import java.util.Scanner;

public class exercice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez les nombres séparés par des espaces :");

		String[] input = sc.nextLine().split(" ");
		int n = input.length;
		int[] t = new int[n];

		for (int i = 0; i < n; i++) {
			t[i] = Integer.parseInt(input[i]);
		}

		int max = 1;
		int actuel = 1;

		for (int i = 1; i < n; i++) {
			if (t[i] > t[i - 1]) {
				actuel++;
			} else {

				if (actuel > max)
					max = actuel;
				actuel = 1;
			}
		}

		if (actuel > max)
			max = actuel;

		System.out.println("Résultat : " + max);
		sc.close();
	}

}
