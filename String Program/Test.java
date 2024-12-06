class Test
{
	public static void main(String[] args)
	{
		int[] arr ={1,2,3,4,7,6};
		
		int sum = 12;
		
		for(int i=0;i<arr.length;i++)
		{
			int currentSum=0;
			
			for(int j=i;j<arr.length;j++)
			{
				currentSum+=arr[j];
				
				if(currentSum==sum)
				{
					for(int k=i;k<=j;k++)
					{
						System.out.print(arr[k]+" ");
					}
				}
			}
		}
	}
}
