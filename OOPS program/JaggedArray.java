import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a jagged array with different sizes for each row
        int[][] arr = new int[3][]; // Declaring a jagged array with 3 rows
        arr[0] = new int[3]; // First row has 3 elements
        arr[1] = new int[2]; // Second row has 2 elements
        arr[2] = new int[4]; // Third row has 4 elements

        // Taking input from the user for each element in the jagged array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { // Using arr[i].length to get the correct column length
                System.out.println("Enter the element of arr[" + i + "][" + j + "]:");
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing the jagged array
        System.out.println("The elements of the jagged array are:");
        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " "); // Print each element in the row
            }
            System.out.println(); // Move to the next line after each row
        }

        sc.close(); // Close the Scanner object
    }
}
