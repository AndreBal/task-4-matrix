package by.epam.matrix.task2;

public class SecondTask {
	public static int[][] execute(int n) {
		int[][] result = new int[n][n];
		for (int i = 0; i < n; i++) {
			result[i][i] = (i+1)*(i+2);
		}
		return result;
	}
}
