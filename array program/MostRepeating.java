public class MostRepeating  {
    public static void main(String[] args) {
        int[] arr={5,1,2,4,2,9,7,2,2,6,6,2};
        int maxCout=0;
        int element=0;
        for(int i=1;i<arr.length;i++)
        {
                int cnt=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    cnt++;
                
                }
            }
        if(cnt>maxCout)
        {
            maxCout=cnt;
            element=arr[i];
        }
    }
        System.out.println(element+" is repiting "+maxCout+" times");
    
}
}
