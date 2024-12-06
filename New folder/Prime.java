import java.util.Scanner;
class Prime{
public static void main(String[] args)
{
    
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();

    

        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0) 
            {
                System.out.println(num+" is not prime");
                break;


            }
            else
            System.out.println("is prime"+num);

        }
}
       
    
}