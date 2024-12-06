public class pattern2 {
    public static void main(String[] args) {
        for(int i=4;i>=1;i--)
        
        {
            //space
            for(int j=4;j>i;j--)
            {
                System.out.print(" ");
            }
            //left side 
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            //right side 
            for(int j=i-1;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
