class Demo_1  
{
	public static void main(String[] args) 
	{
		int[] arr={7,1,6,2,3,5};
		
		int sum_of_ele=arr.length+1;
		
		int sum=(sum_of_ele*(sum_of_ele + 1))/2;
		
		for(int i:arr)
		{
			sum=sum-i;
		}
		
		System.out.println(sum);
	}
}