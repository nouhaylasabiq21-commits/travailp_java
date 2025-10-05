package tp2;

public class exercice4 {
	public static void main(String[] args) {
		int[][] mat = { { 1, 1, 1, 0 }, { 1, 1, 0, 1 }, { 1, 1, 0, 0 }, { 1, 1, 1, 1 } };

		int n = mat.length;
		int m = mat[0].length;
		int maxArea = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mat[i][j] == 1) {
					int width = Integer.MAX_VALUE;
					for (int k = i; k < n && mat[k][j] == 1; k++) {
						int rowWidth = 0;
						while (j + rowWidth < m && mat[k][j + rowWidth] == 1) {
							rowWidth++;
						}
						width = Math.min(width, rowWidth);
						maxArea = Math.max(maxArea, width * (k - i + 1));
					}
				}
			}
		}

		System.out.println("Surface du plus grand rectangle : " + maxArea);
	}
}
