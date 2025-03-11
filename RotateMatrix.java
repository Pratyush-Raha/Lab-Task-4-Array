import java.util.Scanner;

public class RotateMatrix{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for matrix size
        System.out.print("Enter the size of the square matrix (N x N): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        // Taking input for matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Rotating the matrix by 90 degrees clockwise
        rotateMatrix(matrix, n);

        // Printing the rotated matrix
        System.out.println("Matrix after 90-degree clockwise rotation:");
        printMatrix(matrix, n);

        scanner.close();
    }

    // Method to rotate the matrix by 90 degrees clockwise
    public static void rotateMatrix(int[][] matrix, int n) {
        // Step 1: Transpose the matrix (convert rows to columns)
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Swap matrix[i][j] with matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row to complete the rotation
        for (int i = 0; i < n; i++) {
            for (int j = 0, k = n - 1; j < k; j++, k--) {
                // Swap elements in each row
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
        }
    }

    // Method to print the matrix
    public static void printMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
