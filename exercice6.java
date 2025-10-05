package tp2;

import java.util.Scanner;

public class exercice6 {

	public static int sommeMaximale(int[] tab) {
		int maxFin = tab[0];
		int maxGlobal = tab[0];

		for (int i = 1; i < tab.length; i++) {
			maxFin = Math.max(tab[i], maxFin + tab[i]);
			maxGlobal = Math.max(maxGlobal, maxFin);
		}

		return maxGlobal;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez la taille du tableau :");
		int n = sc.nextInt();
		int[] tab = new int[n];
		System.out.println("Entrez les éléments du tableau :");
		for (int i = 0; i < n; i++) {
			tab[i] = sc.nextInt();
		}

		int resultat = sommeMaximale(tab);
		System.out.println("La somme maximale d'une sous-suite contiguë est : " + resultat);
		sc.close();
	}
}
