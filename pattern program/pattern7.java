public class pattern7 {
    public static void main(String[] args) {
        //row
        for(int i=0;i<5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            int number=1;
            for(int k=0;k<=i;k++)
            {
                System.out.print(number+" ");
                number=number*(i-k)/(k+1);
            }
        }
    }
}
