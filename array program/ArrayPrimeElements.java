public class ArrayPrimeElements {
    public static void main(String[] args) {
        int[] arr={2,5,3,6,7,9,11};
        for (int n : arr) {
            boolean flag=true;
            for(int i=2;i<=n/2;i++ )
            {
                if(n%i==0)
                {
                    flag=false;
                    break;
                }
                if(flag==true){
                  System.out.print(n+" ");
       }
            }
        
        }
         
    }   
}
