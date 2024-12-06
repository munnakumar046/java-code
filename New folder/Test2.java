import java.util.Scanner;
class Test2
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();

		int[] arr=new int[size];

		//insert element
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("enter the element");
			arr[i]=sc.nextInt();
		}
		
		//display element
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}








// class Test2
// {
// 	public static void main(String[] args)
// 	{
// 		int[] arr={10,20,30,40,50};
// 		for(int i:arr)
// 		System.out.print(i+ " ");
// 	}
// }