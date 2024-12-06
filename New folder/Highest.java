public class Highest {
    public static void main(String[] args)
    {
        int[] arr={5,6,4,2,7,6,8,9,2,3};

        int firstElement=Integer.MIN_VALUE;
        int secondElement=Integer.MIN_VALUE;
        int thirdElement=Integer.MIN_VALUE;

        for (int i : arr) 
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

        System.out.print(firstElement+" "+secondElement+" "+thirdElement);
    }
}
