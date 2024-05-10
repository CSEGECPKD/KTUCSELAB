import java.util.Scanner;

public class matrixMultiplication 
{

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number of rows and columns of the first matrix");
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();

            System.out.println("Enter the number of rows and columns of the second matrix");
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();

            if (c1 != r2) {
                // If the number of columns in the first matrix is not equal to the number of rows in the second matrix,
                // matrix multiplication is not possible
                System.out.println("Matrix multiplication is not possible");
            } else {
                int mat1[][] = new int[r1][c1];
                int mat2[][] = new int[r2][c2];
                int mat3[][] = new int[r1][c2];

                System.out.println("Enter the elements of the first matrix");
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c1; j++) {
                        mat1[i][j] = sc.nextInt();
                    }
                }

                System.out.println("Enter the elements of the second matrix");
                for (int i = 0; i < r2; i++) {
                    for (int j = 0; j < c2; j++) {
                        mat2[i][j] = sc.nextInt();
                    }
                }

                System.out.println("Multiplication of the matrices");
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c2; j++) {
                        for (int k = 0; k < r2; k++) {
                            mat3[i][j] += mat1[i][k] * mat2[k][j];
                        }
                    }
                }

                System.out.println("Resultant matrix");
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c2; j++) {
                        System.out.print(mat3[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
