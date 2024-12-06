class Parent{
    public void methodOne()
    {
        System.out.println("method-1");
    }
}
class Child extends Parent
{
      public void methodTwo()
    {
        
            System.out.println("method-2");
        
    }

}
  
class Isarelation 
{
    public static void main(String[] args) 
    {
         Parent p=new Parent();
         p.methodOne();

         Child c=new Child();
         c.methodOne();
         c.methodTwo();

         Parent p1=new Child();
         p1.methodOne();

        //  Child c1=new Parent();
        //  p1.methodOne();
    }
   
}
