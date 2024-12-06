public class UniqueElements  {
    public static void main(String[] args) {
     
                // System.out.println("munna");
                int[] arr={3,2,1,5,3,8,4,1};
                for(int i=0;i<arr.length;i++)
                {
                    int cnt=0;
                    for(int j=0;j<arr.length;j++)
                    {
                        if(arr[i]==arr[j])
                        {
                            cnt++;
                        }
                    }
                        if(cnt==1)
                        {
                            System.out.print(arr[i]+" ");
                        }
                    
                }
            }
        }
                
    