package by.epam.matrix.task3;

public class ThirdTask {
	public static int[][] execute(int n) {
		int[][] result = new int[n][n];
		for (int i = 0; i < n / 2; i++) {
			for (int j = i; j < (n - i); j++) {
				result[i][j] = 1;
				result[n - (i + 1)][j] = 1;
			}
		}

		return result;
	}

}
