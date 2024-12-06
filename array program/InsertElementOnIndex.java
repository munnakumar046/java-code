import java.util.Arrays; 
class InsertElementOnIndex 
{ 
 public static void main(String[] args)  
 { 
  int[] arr ={8,4,1,6,9,2};  
  int element = 10;  
  int index = 5; 
   
  arr=Arrays.copyOf(arr,arr.length+1); 
 
  for(int i=arr.length-1;i>=index;i--) 
  { 
    arr[i]=arr[i-1]; 
  } 
  arr[index]=element; 
 
  //display 
  for(int i:arr) 
  { 
   System.out.print(i+" "); 
  } 
 
 } 
} 