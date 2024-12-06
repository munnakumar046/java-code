class A
{
    int i=10,j=20;
}
    class B extends A
    {
         int i=30,j=40;
         B(int i, int j)
    {
        
        System.out.println(i+" "+j);
        System.out.println(this.i+" "+ this.j);
        System.out.println(super.i+" "+super.j);
    }
    }
   

public class Thi51 {
    public static void main(String[] args) {
        B b=new B(100, 200);
    }   
}
