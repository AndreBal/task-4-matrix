package by.epam.matrix.task6;

public class SixthTask {
	static int[][] result;

	public static int[][] execute(int n) {
		if (n == 2 || n < 1) {
			System.out.println("There is no magic square for this n");
			return new int[0][0];
		}

		int[] arr = new int[n * n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		findAllMagic(n * n, arr);
		return result;
	}

	public static void findAllMagic(int counter, int[] arr) {

		if (counter == 1) {
			if (isMagicSquare(arr)) {
				result = transformArrayToMatrix(arr);
			}
		} else {
			for (int i = 0; i < counter - 1; i++) {
				findAllMagic(counter - 1, arr);
				if (counter % 2 == 0) {
					swap(arr, i, counter - 1);
				} else {
					swap(arr, 0, counter - 1);
				}
			}
			findAllMagic(counter - 1, arr);
		}
	}

	private static void swap(int[] input, int a, int b) {
		int tmp = input[a];
		input[a] = input[b];
		input[b] = tmp;
	}

	static boolean isMagicSquare(int[] arr) {
		int n = (int) Math.sqrt(arr.length);
		int magicNumber = 0; // not so magic if this is not a magic square
		int secondMagicNumber = 0;
		for (int i = 0; i < arr.length; i += n) {
			magicNumber += arr[i];
		}

		for (int i = 1; i < n; i++) { 
			secondMagicNumber = 0;
			for (int j = i; j < arr.length; j += n) {
				secondMagicNumber += arr[j];
			}
			if (secondMagicNumber != magicNumber) {
				return false;
			}
		}

		for (int i = 0; i < arr.length; i += n) { 
			secondMagicNumber = 0;
			for (int j = i; j < i + n; j++) {
				secondMagicNumber += arr[j];
			}
			if (secondMagicNumber != magicNumber) {
				return false;
			}
		}
		secondMagicNumber = 0;
		for (int i = 0; i < n; i++) {
			secondMagicNumber += arr[(i * n) + i];
		}
		if (secondMagicNumber != magicNumber) {
			return false;
		}
		secondMagicNumber = 0;
		for (int i = n - 1; i < arr.length - 1; i += n - 1) {
			secondMagicNumber += arr[i];
		}
		if (secondMagicNumber != magicNumber) {
			return false;
		}
		return true;
	}

	static int[][] transformArrayToMatrix(int[] arr) {
		int n = (int) Math.sqrt(arr.length);
		int[][] result = new int[n][n];
		for (int row = 0, i = 0; row < result.length; row++) {
			for (int col = 0; col < result[row].length; col++, i++) {
				result[row][col] = arr[i];
			}
		}
		return result;
	}

}
