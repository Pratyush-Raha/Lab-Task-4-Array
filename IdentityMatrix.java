import java.util.Scanner;

public class IdentityMatrix{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for matrix size
        System.out.print("Enter the size of the square matrix (N x N): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        // Taking input for the matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Checking if the matrix is an identity matrix
        boolean isIdentity = checkIdentityMatrix(matrix, n);

        // Printing the result
        if (isIdentity) {
            System.out.println("The given matrix is an Identity Matrix.");
        } else {
            System.out.println("The given matrix is NOT an Identity Matrix.");
        }

        scanner.close();
    }

    // Method to check if a matrix is an identity matrix
    public static boolean checkIdentityMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j && matrix[i][j] != 1) || (i != j && matrix[i][j] != 0)) {
                    return false; // If diagonal is not 1 or other elements are not 0, return false
                }
            }
        }
        return true; // If all conditions meet, return true
    }
}
