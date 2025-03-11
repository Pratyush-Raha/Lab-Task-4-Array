import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Taking the number of rows and columns for the matrix
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        
        // Declare a 2D array with the given size
        int[][] matrix = new int[rows][cols];
        
        // Taking input for matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // Print the matrix to display it to the user
        System.out.println("\nThe matrix is:");
        printMatrix(matrix, rows, cols);
        
        // Check if the matrix is symmetric
        if (isSymmetric(matrix, rows, cols)) {
            System.out.println("\nThe matrix is symmetric.");
        } else {
            System.out.println("\nThe matrix is not symmetric.");
        }
    }
    
    // Method to print the matrix
    public static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Print new line after each row
        }
    }
    
    // Method to check if the matrix is symmetric
    public static boolean isSymmetric(int[][] matrix, int rows, int cols) {
        // A matrix is symmetric if it is square (rows == cols)
        if (rows != cols) {
            return false;  // If it's not square, it can't be symmetric
        }
        
        // Check if the matrix is equal to its transpose
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) {  // Only check upper triangle (i < j)
                if (matrix[i][j] != matrix[j][i]) {
                    return false;  // If any element is not equal to its transpose, it's not symmetric
                }
            }
        }
        
        return true;  // If all checks pass, the matrix is symmetric
    }
}
