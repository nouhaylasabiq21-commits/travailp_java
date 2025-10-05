package tp2;

import java.util.Scanner;

public class exercice8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Entrez la taille du tableau n : ");
		int n = sc.nextInt();
		int[] tab = new int[n];

		System.out.println("Entrez les éléments du tableau (entre 1 et " + n + ") :");
		for (int i = 0; i < n; i++) {
			tab[i] = sc.nextInt();
		}

		boolean[] present = new boolean[n + 1];

		for (int i = 0; i < n; i++) {
			if (tab[i] >= 1 && tab[i] <= n) {
				present[tab[i]] = true;
			}
		}

		System.out.print("Nombres absents : ");
		for (int i = 1; i <= n; i++) {
			if (!present[i]) {
				System.out.print(i + " ");
			}
		}

		sc.close();
	}
}
