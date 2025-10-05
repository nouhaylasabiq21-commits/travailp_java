package tp2;

import java.util.Scanner;

public class exercice10 {

	public static boolean estMagique(int[][] mat) {
		int n = 3;
		int sommeMagique = 0;

		for (int j = 0; j < n; j++) {
			sommeMagique += mat[0][j];
		}

		for (int i = 1; i < n; i++) {
			int sommeLigne = 0;
			for (int j = 0; j < n; j++) {
				sommeLigne += mat[i][j];
			}
			if (sommeLigne != sommeMagique)
				return false;
		}

		for (int j = 0; j < n; j++) {
			int sommeCol = 0;
			for (int i = 0; i < n; i++) {
				sommeCol += mat[i][j];
			}
			if (sommeCol != sommeMagique)
				return false;
		}

		int sommeDiag1 = mat[0][0] + mat[1][1] + mat[2][2];
		int sommeDiag2 = mat[0][2] + mat[1][1] + mat[2][0];
		if (sommeDiag1 != sommeMagique || sommeDiag2 != sommeMagique)
			return false;

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] mat = new int[3][3];

		System.out.println("Entrez les éléments de la matrice 3x3 :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		if (estMagique(mat)) {
			System.out.println("La matrice est magique !");
		} else {
			System.out.println("La matrice n'est pas magique.");
		}

		sc.close();
	}
}
