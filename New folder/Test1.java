import java.util.Scanner;

public class Test1{
    public static int count = 2;

    // Function to check if the given number is lucky
    static boolean isLuckyNumber(int n) {
        if (count > n) {
            return true;
        }
        if (n % count == 0) {
            return false;
        }
        // Determine the position of the given number
        n = n - (n / count);
        count++;
        return isLuckyNumber(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        // Calling the user-defined function
        if (isLuckyNumber(num)) {
            System.out.println(num + " is a Lucky Number.");
        } else {
            System.out.println(num + " is not a Lucky Number.");
        }
    }
}
