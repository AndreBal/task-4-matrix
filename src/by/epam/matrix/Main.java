package by.epam.matrix;

import by.epam.matrix.task1.FirstTask;
import by.epam.matrix.task2.SecondTask;
import by.epam.matrix.task3.ThirdTask;
import by.epam.matrix.task4.FourthTask;
import by.epam.matrix.task5.FifthTask;
import by.epam.matrix.task6.SixthTask;

public class Main {

	public static void main(String[] args) {
		int n = 3;
		int[] arr = {1,2,3,4,5}; 
		int[][] first = {{2,0,-1},{0,-2,2}};
		int[][] second = {{4,1,0},{3,2,1},{0,1,0}};
		//printMatrix(FirstTask.execute(n));
		//printMatrix(SecondTask.execute(n));
		//printMatrix(ThirdTask.execute(n));
		//printMatrix(FourthTask.execute(arr));
		//printMatrix(FifthTask.execute(first,second));
		printMatrix(SixthTask.execute(n));
	}
	
	public static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
	        for (int col = 0; col < matrix[row].length; col++) {
	            System.out.printf("%5d", matrix[row][col]);
	        }
	        System.out.println();
	    }
	}

}
