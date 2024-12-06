public class pattern4 {
    public static void main(String[] args) {
        //ascending
        for(int i=1;i<=4;i++)
        {
            //space
            for(int j=4;j>i;j--)
            {
            System.out.print(" ");
            }
            //left side
            for(int j=1;j<=i;j++)
            {
                if (j==1) 
                System.out.print("*");     
                else
                    System.out.print(" ");               
            }
            //right side
            for(int j=i-1;j>=1;j--)
            if (j==1) 
                System.out.print("*");            
            else
                System.out.print(" ");       
            //new line
            System.out.println();
        }
        //descending
        for(int i=3;i>=1;i--)
        {
            //space
            for(int j=4;j>i;j--)
            {
            System.out.print(" ");
            }
            //left side
            for(int j=1;j<=i;j++)
            {
                if (j==1) 
                System.out.print("*");     
                else
                    System.out.print(" ");
            }
            //right side
            for(int j=i-1;j>=1;j--){
            if (j==1) 
                System.out.print("*");
            else
                System.out.print(" ");
        }
            //new line
            System.out.println();
        }
    }
}
