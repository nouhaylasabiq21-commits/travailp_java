package tp2;

import java.util.Scanner;

public class exercice9 {

	public static int differenceDiagonales(int[][] mat) {
		int n = mat.length;
		int sommePrincipale = 0;
		int sommeSecondaire = 0;

		for (int i = 0; i < n; i++) {
			sommePrincipale += mat[i][i];
			sommeSecondaire += mat[i][n - 1 - i];
		}

		return Math.abs(sommePrincipale - sommeSecondaire);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Entrez la taille de la matrice carrée n : ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		System.out.println("Entrez les éléments de la matrice :");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int diff = differenceDiagonales(mat);
		System.out.println("Valeur absolue de la différence des diagonales : " + diff);

		sc.close();
	}
}
