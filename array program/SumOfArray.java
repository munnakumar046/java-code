/**
 * SumOfArray
 */
public class SumOfArray {

    public static void main(String[] args) {
        int[] arr={2,4,9,2,4,5};
        int sum=0;
        System.out.println("this is array elements");
        for (int i : arr) {
            System.out.print(i+" ");          
        }
        for (int i : arr) {
             sum=sum+i;
        }
        System.out.println("sum of array elements" +sum);
    }
}