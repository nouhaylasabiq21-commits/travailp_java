package tp2;

import java.util.Scanner;

public class exercice5 {

	public static boolean estPermutationCirculaire(int[] tab) {
		int n = tab.length;
		boolean[] vus = new boolean[n];

		for (int i = 0; i < n; i++) {
			if (tab[i] < 1 || tab[i] > n)
				return false;
			if (vus[tab[i] - 1])
				return false;
			vus[tab[i] - 1] = true;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Entrez la taille n du tableau : ");
		int n = sc.nextInt();
		int[] tab = new int[n];

		System.out.println("Entrez les éléments du tableau :");
		for (int i = 0; i < n; i++) {
			tab[i] = sc.nextInt();
		}

		if (estPermutationCirculaire(tab)) {
			System.out.println("Le tableau est une permutation circulaire valide.");
		} else {
			System.out.println("Le tableau n'est pas une permutation circulaire valide.");
		}

		sc.close();
	}
}
