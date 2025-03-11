import java.util.Scanner;  // Importing Scanner class to take input from the user

public class Print2DArray {  // Defining the main class
    public static void main(String[] args) {  // The main method, where execution starts
        Scanner scanner = new Scanner(System.in);  // Creating a Scanner object to take user input

        // Taking input for the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();  
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();  

        int[][] array = new int[rows][cols];  // Declaring a 2D array with given rows and columns

        // Taking input for the 2D array
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < rows; i++) {  
            for (int j = 0; j < cols; j++) {  
                array[i][j] = scanner.nextInt();  
            }
        }

        // Printing the 2D array
        System.out.println("The elements of the 2D array are:");
        for (int i = 0; i < rows; i++) {  
            for (int j = 0; j < cols; j++) {  
                System.out.print(array[i][j] + " ");  // Printing each element with a space
            }
            System.out.println();  // Moving to the next line after printing each row
        }

    }
}
