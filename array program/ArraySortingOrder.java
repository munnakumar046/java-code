public class ArraySortingOrder {
    public static void main(String[] args) {
        int[] arr={5,4,8,2,9,11,7,1};
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            // for(int j=0;j<arr.length;j++)
            for(int j=i+1;j<arr.length;j++)
            {
                // if(arr[i]<arr[j])
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
