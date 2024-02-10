/*
Create a class matrix with the following methods

1. To check if it is a square matrix or not

2. To find transpose of a matrix

3. To multiply two matrices Read the elements of the matrix from the user.
*/
import java.util.Scanner;

class Matrix {
    private int[][] matrix;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[rows][columns];
    }

    public void readMatrixFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public boolean isSquareMatrix() {
        return rows == columns;
    }

    public Matrix transpose() {
        Matrix transposedMatrix = new Matrix(columns, rows);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix.matrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

    public Matrix multiply(Matrix otherMatrix) {
        if (columns != otherMatrix.rows) {
            throw new IllegalArgumentException("Cannot multiply matrices. Invalid dimensions.");
        }

        Matrix multipliedMatrix = new Matrix(rows, otherMatrix.columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < otherMatrix.columns; j++) {
                int sum = 0;
                for (int k = 0; k < columns; k++) {
                    sum += matrix[i][k] * otherMatrix.matrix[k][j];
                }
                multipliedMatrix.matrix[i][j] = sum;
            }
        }

        return multipliedMatrix;
    }
}

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        Matrix matrix = new Matrix(rows, columns);
        matrix.readMatrixFromUser();

        System.out.println("Is it a square matrix? " + matrix.isSquareMatrix());

        Matrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed matrix:");
        transposedMatrix.printMatrix();

        System.out.print("Enter the number of rows for the second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int columns2 = scanner.nextInt();

        Matrix matrix2 = new Matrix(rows2, columns2);
        matrix2.readMatrixFromUser();

        try {
            Matrix multipliedMatrix = matrix.multiply(matrix2);
            System.out.println("Multiplied matrix:");
            multipliedMatrix.printMatrix();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}