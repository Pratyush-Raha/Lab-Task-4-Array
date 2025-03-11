import java.util.Scanner;  // Import Scanner class for user input

public class MaxMinArray {
    public static void main(String[] args) {  // Main method
        Scanner scanner = new Scanner(System.in);  // Create Scanner object

        // Taking input for number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];  // Declare a 2D array

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < rows; i++) {  // Outer loop for rows
            for (int j = 0; j < cols; j++) {  // Inner loop for columns
                array[i][j] = scanner.nextInt();  // Taking input for each element
            }
        }

        // Initialize min and max with the first element of the array
        int max = array[0][0];
        int min = array[0][0];

        // Find max and min in the array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] > max) max = array[i][j];  // Update max if found a larger element
                if (array[i][j] < min) min = array[i][j];  // Update min if found a smaller element
            }
        }

        // Printing the 2D array
        System.out.println("The elements of the 2D array are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");  // Print each element
            }
            System.out.println();  // Move to next line after each row
        }

        // Printing the results
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

       
    }
}
