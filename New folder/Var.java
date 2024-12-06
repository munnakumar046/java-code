class Var{
	
	public static void main(String[] var)
	{
	m1();
	Var t1=new Var();
	t1.m1();
	Var.m1();
	}
	public static void m1(){
		System.out.println("Hello, World");
		
		//int a=10;
		int x=10;
		int y=20;
		int z=x+y;
		System.out.println(z);
	}

}