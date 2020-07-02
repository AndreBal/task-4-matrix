package by.epam.matrix.task1;

public class FirstTask {
	public static int[][] execute(int n) {
		int[][] result = new int[n][n];
		for (int i = 0; i < n; i++) {
			if (i % 2 != 1) {
				for (int j = 0; j < n; j++) {
					result[i][j] = j + 1;
				}
			} else {
				for (int j = 0; j < n; j++) {
					result[i][j] = n - j;
				}
			}
		}

		return result;
	}

}
