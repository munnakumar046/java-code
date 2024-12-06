public class pattern3 
{
    public static void main(String[] args) 
    {
        //ascending
        for(int i=1;i<=4;i++)
    {
        for(int j=4;j>i;j--)
        {
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        for(int j=i-1;j>=1;j--)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
        //ascending
        for(int i=3;i>=1;i--)
    {
        for(int j=4;j>i;j--)
        {
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        for(int j=i-1;j>=1;j--)
        {
            System.out.print("* ");
        }
        System.out.println();
    }

}
}
