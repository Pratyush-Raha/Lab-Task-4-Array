import java.util.Scanner;

public class SearchinArray {
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
        
        // Asking user for the number to search in the matrix
        System.out.print("\nEnter the number to search: ");
        int target = sc.nextInt();
        
        // Call the search function to find the number
        searchMatrix(matrix, rows, cols, target);
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
    
    // Method to search for the number in the matrix and print its position
    public static void searchMatrix(int[][] matrix, int rows, int cols, int target) {
        // Loop through each element of the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // If the target number is found, print its position (i, j)
                if (matrix[i][j] == target) {
                    System.out.println("Number " + target + " found at position: (" + i + ", " + j + ")");
                    return; // Exit the method once the number is found
                }
            }
        }
        // If number is not found in the matrix
        System.out.println("Number " + target + " not found in the matrix.");
    }
}
