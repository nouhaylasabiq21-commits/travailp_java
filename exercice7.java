package tp2;

public class exercice7 {

	public static int frequenceMajoritaire(int[] tab) {
		int n = tab.length;

		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (tab[j] == tab[i]) {
					count++;
				}
			}
			if (count > n / 2) {
				return tab[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] tab = { 6, 6, 6, 6, 3, 7, 9 };
		int result = frequenceMajoritaire(tab);

		if (result != -1) {
			System.out.println("L'élément majoritaire est : " + result);
		} else {
			System.out.println("Il n'y a pas d'élément majoritaire.");
		}
	}
}
