package by.epam.matrix.task4;

public class FourthTask {
	public static int[][] execute(int[] arr) {
		int n = arr.length;
		int[][] result = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result[i][j] = (int) Math.pow(arr[j], (i + 1));
			}
		}

		return result;
	}

}
