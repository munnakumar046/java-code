public class count {
    public static void main(String[] args)
    {
        int k=1;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(k<=9)
                {
                    System.out.print(k++ +" ");
                }                
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
