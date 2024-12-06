public class ArrayEvenElements {
    public static void main(String[] args) {
        int arr[]={2,5,3,7,8,11,7,99};
        for (int i : arr) {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
