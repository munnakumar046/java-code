//Q) Write a java program to  display three highest elements from given array?
class Demo{
	public static void main(String[] arg)
	{
		int[] arr={5,3,7,1,9,3,7,13,};
		int firstNumber=Integer.MIN_VALUE;
		int secondNumber=Integer.MIN_VALUE;
		int thirdNumber=Integer.MIN_VALUE;

		for (int i : arr) {
			if(i>firstNumber)
			{
				thirdNumber=secondNumber;
				secondNumber=firstNumber;
				firstNumber=i;
			}
			else if(i>secondNumber)
			{ 
				thirdNumber=secondNumber;
				secondNumber=i;
			}
			else if(i>thirdNumber)
			{ 
				thirdNumber=i;
			}
			
		}
		System.out.println(firstNumber+" "+secondNumber+" "+thirdNumber);

	}
}