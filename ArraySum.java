import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking input for the number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols];  // Declaring a 2D array
        int sum = 0;  // Variable to store the sum of elements
        // Taking input for the 2D array
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < rows; i++) {  
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();  // Storing user input
                sum += array[i][j];  // Adding the element to sum
            }
        }
        // Printing the 2D array
        System.out.println("The elements of the 2D array are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");  // Printing each element
            }
            System.out.println();  // Move to the next line after printing a row
        }

        // Printing the sum of all elements
        System.out.println("Sum of all elements: " + sum);
    }
}
