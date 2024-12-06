class A 
{
    A()
    {
        System.out.println("one");
    }
    A(int i)
    {
        this();
        System.out.println("Two");
    
    }
    A(double d){
        this(19);
        
        System.out.println("three");

    }
}
public class Thi53 {
    public static void main(String[] args)
    {
        A a=new A(10.5d);
    }
}
