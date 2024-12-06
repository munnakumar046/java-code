//import java.util.Arrays;
class Test3
{
    public static void main(String[] args)
    {
        int[] arr={7,6,4,6,2,3,9,1,3,2};
  //      Arrays.sort(arr);
        // assanding logic
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i:arr)
        {
           System.out.print(i+" ");
        } 
    }
}