public class ArrayHighestElements {
    public static void main(String[] args) {
        int arr[]={2,5,3,7,8,11,7,99};
        int big=arr[0];
        for (int i : arr) {
                if(i>big)
                {
                    big=i;
                }
        }
        System.out.println(big);
    }
}
