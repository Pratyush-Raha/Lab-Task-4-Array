import java.util.Scanner;
public class RowColsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking input for the number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols]; // Declaring a 2D array
        // Taking input for the 2D array
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt(); // Storing user input
            }
        }
        // Printing the 2D array
        System.out.println("The elements of the 2D array are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " "); // Printing each element
            }
            System.out.println(); // Move to the next line after printing a row
        }
        // Calculating and printing the sum of each row
        System.out.println("Sum of each row:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += array[i][j]; // Adding elements of the row
            }
            System.out.println("Row " + (i + 1) + " sum: " + rowSum);
        }
        // Calculating and printing the sum of each column
        System.out.println("Sum of each column:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += array[i][j]; // Adding elements of the column
            }
            System.out.println("Column " + (j + 1) + " sum: " + colSum);
        }

    }
}
