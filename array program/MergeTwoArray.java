import java.util.*;
public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1={3,2,1,5,4};
        int[] arr2={7,6,8,9,10};

        int size1=arr1.length;
        int size2=arr2.length;

        arr1=Arrays.copyOf(arr1, size1+size2);
        int j=0;
        for(int i=size1;i<arr1.length;i++)
        {
            arr1[i]=arr2[j++];
        }
        Arrays.sort(arr1);
        for (int i : arr1) {
            System.out.print(i+" ");
        }


    }
}
