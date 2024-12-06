import java.util.Scanner;
class Per{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();

		System.out.println("Enter second number");
		int b=sc.nextInt();


		System.out.println("Enter third number");
		int c=sc.nextInt();

		float greater=(a>b)?((a>c)?a:c):((b>c)?b:c);
		
		System.out.println("greastest number is="+greater);
	}
}
		


