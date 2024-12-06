class MultiplyArray 
{ 
 public static void main(String[] args)  
 { 
  int[] arr1 ={5,9,2};  
  int[] arr2 ={1,4}; 
 
  //caller method 
  int a=Integer.parseInt(arrayToString(arr1)); 
  int b=Integer.parseInt(arrayToString(arr2)); 
  System.out.println(a*b); 
 } 
 
 public static String arrayToString(int[] arr) 
 { 
  StringBuffer sb=new StringBuffer(); 
  for(int i:arr) 
  { 
   sb.append(i); 
  } 
 
  return sb.toString(); 
 } 
} 