class A
{
    public void m1()
    {
        System.out.println("method1");
    }
}
class B extends A{
    public void m2()
    {
        System.out.println("method2");
    }
}
class C extends B{
    public void m3()
    {
        System.out.println("method3");
    }
}
public class Multi {
    public static void main(String[] args)
    {
        A a=new A();
        a.m1();

        B b=new B();
        b.m1();
        b.m2();

        C c=new C();
        c.m1();
        c.m2();
        c.m3();
    }
}
