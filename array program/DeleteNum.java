public class DeleteNum {
    public static void main(String[] args) {
        int[] arr={6,4,2,6,3,2,7};
        int[] newArr=new int[arr.length-1];
        int element=2;
        int cnt=0;
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==element&&cnt==0)
            {
                cnt=1;
                continue;
            }
            newArr[j++]=arr[i];
        }
        
        for (int i : newArr) {
            System.out.print(i+" ");
        }
    }
}
