public class DuplicateElements  {
    public static void main(String[] args) {
        // System.out.println("munna");
        int[] arr={3,2,1,5,3,8,4,1};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
