//Q) Write a java program to find out N-th element of fibonacci series?
//fibonacci sequence : 0 1 1 2 3 5 8
import java.util.Scanner;
class fibonacci
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();

		//caller method
		System.out.println(fib(n));

	}
	public static int fib(int n)
	{
		if(n==0 || n==1)
			return 0;
		if(n==2)		
			return 1;

		return fib(n-1)+fib(n-2);	

	}

}