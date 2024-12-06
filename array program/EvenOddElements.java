public class EvenOddElements {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,7,6,9,8};
        int even=0;
        int odd=0;
        for (int i : arr) {
            if (i%2==0) {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println(even +" "+odd);
    }
}
