/**
 * AddTwoArray
 */
public class AddTwoArray {

    public static void main(String[] args) {
        int[] arr1={8,1,3,5,2};
        int[] arr2={1,8,6,4,7};

        int[] arr3=new int[arr1.length];

        for(int i=0;i<arr1.length&&i<arr2.length;i++)
        {
            arr3[i]=arr1[i]+arr2[i];
        }
        for (int i : arr3) {
            System.out.print(i+" ");
        }

    }
}