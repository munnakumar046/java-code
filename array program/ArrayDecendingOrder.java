public class ArrayDecendingOrder {
    public static void main(String[] args) {
        int arr[]={2,5,3,7,8,11,7,99};
        
        for (int i=0;i<arr.length;i++) 
        {
            for(int j=0;j<arr.length;j++)
            {
            // if(arr[i]<arr[j]) // Assending order
            if(arr[i]>arr[j]) //decending order
            {
                int temp=arr[i];
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
