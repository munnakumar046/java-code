public class ArrayOddElements {
    public static void main(String[] args) {
        int[] arr={5,3,7,8,2,1,4};
        for (int i : arr) {
            if (i%2!=0) {
                System.out.print(i+" ");
            }
        }
    }
}
