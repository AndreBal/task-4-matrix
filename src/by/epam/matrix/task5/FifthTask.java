package by.epam.matrix.task5;

public class FifthTask {
	public static int[][] execute(int[][] a, int[][] b) {
		int heigth = a.length;
		int width = a[0].length;
		int[][] result = new int[heigth][width];
		for (int i = 0; i < heigth; i++) {
			for (int j = 0; j < width; j++) {
				for (int k = 0; k < width && k < b.length; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return result;
	}

}
