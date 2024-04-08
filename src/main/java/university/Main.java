package university;

import university.Controllers.MatrixManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please specify the dimensions of the matrix:");
        System.out.print("Enter the number of columns: ");
        int columns = MatrixManager.getValidMatrixDimension(in, "columns");

        System.out.print("Enter the number of rows: ");
        int rows = MatrixManager.getValidMatrixDimension(in, "rows");

        System.out.println("Choose how to populate the matrix:");
        System.out.println("1. Manually");
        System.out.println("2. Randomly");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                int[][] matrixManually = MatrixManager.createMatrixManually(columns, rows, in);
                MatrixManager.printMatrix(matrixManually);
                MatrixManager.calculateAndPrint(matrixManually);
                break;
            case 2:
                int[][] matrixRandomly = MatrixManager.createMatrixRandomly(columns, rows);
                MatrixManager.printMatrix(matrixRandomly);
                MatrixManager.calculateAndPrint(matrixRandomly);
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                break;
        }
    }
}