import java.util.Scanner;
public class Boundary {
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
        // Print the boundary elements of the matrix
        System.out.println("\nBoundary elements are:");
        printBoundaryElements(matrix, rows, cols);
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
    // Method to print only the boundary elements of the matrix
    public static void printBoundaryElements(int[][] matrix, int rows, int cols) {
        // Print the first row
        for (int j = 0; j < cols; j++) {
            System.out.print(matrix[0][j] + " ");
        }
        
        // Print the last column (except the first and last element already printed)
        for (int i = 1; i < rows; i++) {
            System.out.print(matrix[i][cols - 1] + " ");
        }
        
        // Print the last row (except the last element already printed)
        if (rows > 1) {
            for (int j = cols - 2; j >= 0; j--) {
                System.out.print(matrix[rows - 1][j] + " ");
            }
        }
        
        // Print the first column (except the first and last element already printed)
        if (cols > 1) {
            for (int i = rows - 2; i > 0; i--) {
                System.out.print(matrix[i][0] + " ");
            }
        }
    }
}
