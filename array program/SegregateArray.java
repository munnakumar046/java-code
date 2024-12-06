public class SegregateArray {
    public static void main(String[] args) {
        int[] arr={1,0,1,0,1,1,0,0,1,0};
        int[] newArr=new int[arr.length];

        int j=0;
        for (int i : arr) {
            if(i==0){
                newArr[j++]=i;
            }
        }
        while (j<arr.length) {
            newArr[j++]=1;
        }
        for (int i : newArr) {
            System.out.print(i+" ");
        }
    }
}
