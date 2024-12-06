class Var2{
	//static variable
	static int i=10;
	public static void main(String[] args)
	{
	System.out.println(i);
	System.out.println(Var2.i);
	Var2 t1=new Var2();
	System.out.println(t1.i*10);
        
	}
}
/*
class Var2{
	public static void main(String[] args)
	{
	//m1();
	//Var2.m1();
	Var2 t1=new Var2();
	t1.m1();
	}
	
	//instance method
	public void m1()
	{
	System.out.println("Hello, World");
		
		int x=10;
		int y=20;
		int z=x+y;
		System.out.println(z);
	}
}
*/