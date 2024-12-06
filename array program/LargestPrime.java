import java.util.*;
public class LargestPrime {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 11, 12 };
        int largestElement = Integer.MIN_VALUE;
        for (int n : arr) {
            boolean flag = true;
            for (int i = 2; i <= n / 2; i++) {
                if (n % 2 == 0) {
                    flag = false;
                    break;
                }
                if (n > largestElement) {
                    largestElement = n;
                }
            }
        }
        System.out.println(largestElement+" ");
    }
}
