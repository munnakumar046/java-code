class A{
    public void m1()
    {
        System.out.println("one");
        this.m2();
    }
    public void  m2()
    {
        System.out.println("two");
    }
}
public class Thi52 {
        public static void main(String[] args) {
            A a=new A();
            a.m1();
            
        }   
}
