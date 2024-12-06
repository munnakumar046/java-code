/**
 * LeaderElement
 */
public class LeaderElement {
    public static void main(String[] args) {
        int[] arr = { 4, 64, 7, 12, 5, 9 };
        int max = arr[arr.length - 1];
        System.out.println(max);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.println(max + " ");
            }
        }

    }

}