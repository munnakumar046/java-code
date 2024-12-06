class Highest3  
{
	public static void main(String[] args) 
	{
		int[] arr={6,9,2,4,7,5,8,1};
		
		int firstElement=Integer.MIN_VALUE;
		int secondElement=Integer.MIN_VALUE;
		int thirdElement=Integer.MIN_VALUE;
		
		//for each loop
		for(int i:arr)
		{
			if(i>firstElement)
			{
				thirdElement=secondElement;
				secondElement=firstElement;
				firstElement=i;
			}
			else if(i>secondElement)
			{
				thirdElement=secondElement;
				secondElement=i;
			}
			else if(i>thirdElement)
			{
				thirdElement=i;
			}
		}
		
		System.out.println(firstElement+" "+secondElement+" "+thirdElement);
	}
}
