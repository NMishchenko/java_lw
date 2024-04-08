package university.Controllers;

import java.util.Scanner;

public class MatrixManager {
    public static final int MAX_SIZE = 20;
    public static final int MIN_SIZE = 1;
    public static final int MIN_RANDOM = 10;
    public static final int MAX_RANDOM = 25;

    public static int getValidMatrixDimension(Scanner in, String dimension) {
        int size = in.nextInt();
        dimension = dimension.substring(0, 1).toUpperCase() + dimension.substring(1);

        while (size > MAX_SIZE || size < MIN_SIZE) {
            System.out.println("The number of " + dimension + " must be between " + MIN_SIZE + " and " + MAX_SIZE);
            System.out.print("Please enter a valid number of " + dimension + ": ");
            size = in.nextInt();
        }

        return size;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void calculateAndPrint(int[][] matrix) {
        int min = getMinValue(matrix);
        int max = getMaxValue(matrix);
        double average = getAverage(matrix);
        double geometricMean = getGeometricMean(matrix);

        System.out.println("Minimum element in the matrix: " + min);
        System.out.println("Maximum element in the matrix: " + max);
        System.out.println("Average of the matrix: " + average);
        System.out.println("Geometric mean of the matrix: " + geometricMean);
    }

    public static int[][] createMatrixRandomly(int columns, int rows) {
        int amountOfRandom = MAX_RANDOM + MIN_RANDOM + 1;
        int[][] matrix = new int[columns][rows];

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                matrix[i][j] = (int) Math.round(Math.random() * amountOfRandom - MIN_RANDOM);
            }
        }

        return matrix;
    }

    public static int[][] createMatrixManually(int columns, int rows, Scanner in) {
        int[][] matrix = new int[columns][rows];

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print("Enter the value for matrix[" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = in.nextInt();
            }
        }

        return matrix;
    }

    public static int getMinValue(int[][] matrix) {
        int min = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (min >= matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
        }

        return min;
    }

    public static int getMaxValue(int[][] matrix) {
        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (max <= matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }

        return max;
    }

    public static double getAverage(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int sum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += matrix[i][j];
            }
        }

        return (double) sum / (rows * columns);
    }

    public static double getGeometricMean(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int multiply = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                multiply *= matrix[i][j];
            }
        }

        double geometricMean = Math.pow(multiply, 1.0 / (rows * columns));
        return geometricMean;
    }
}