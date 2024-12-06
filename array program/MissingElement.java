/**
 * MissingElement
 */
public class MissingElement {

    public static void main(String[] args) {
        int[] arr={5,3,2,1,6};
        // arr=Arrays.copyOf(arr,arr.length+1);
        int sum=arr.length+1;
        int sum_Of=(sum*(sum+1))/2;
        for (int i : arr) {
            sum_Of=sum_Of-i;
        }
        System.out.print( "missing element  "+sum_Of);

    }
}