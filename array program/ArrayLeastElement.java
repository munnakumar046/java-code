public class ArrayLeastElement {
    public static void main(String[] args) {
        int arr[]={7,4,9,2,5,8};
        int small=arr[0];
        for (int i : arr) {
            if(i<small)
            {
                small=i;
            }
        }
        System.out.println(small);
    }
}
