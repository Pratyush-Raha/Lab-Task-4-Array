import java.util.Scanner;

public class MatrixMulti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for rows and columns of first matrix
        System.out.print("Enter number of rows of first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter number of columns of first matrix: ");
        int cols1 = scanner.nextInt();

        // Taking input for rows and columns of second matrix
        System.out.print("Enter number of rows of second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter number of columns of second matrix: ");
        int cols2 = scanner.nextInt();

        // Checking if multiplication is possible
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible. Columns of first matrix must match rows of second matrix.");
            return;
        }
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];
        int[][] productMatrix = new int[rows1][cols2]; // Resultant matrix

        // Taking input for first matrix
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        // Taking input for second matrix
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        // Multiplying the matrices
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                productMatrix[i][j] = 0; // Initialize to 0
                for (int k = 0; k < cols1; k++) {
                    productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        // Printing the first matrix
        System.out.println("First Matrix:");
        printMatrix(matrix1, rows1, cols1);
        // Printing the second matrix
        System.out.println("Second Matrix:");
        printMatrix(matrix2, rows2, cols2);
        // Printing the product matrix
        System.out.println("Product of the matrices:");
        printMatrix(productMatrix, rows1, cols2);

        scanner.close(); // Closing the scanner
    }
    // Method to print a matrix
    public static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
