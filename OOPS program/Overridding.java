class Parent 
{
	//overridden methods 
	public void property()
	{
		System.out.println("Cash+Gold+Land+House");
	}
	public /*final */ void marry()
	{
		System.out.println("Trisha");
	}
}
class Child extends Parent 
{
	//overridding methods
	public void marry()
	{
		System.out.println("Rashmika");
	}
}
class Overridding 
{
	public static void main(String[] args)
	{
		Parent p=new Parent();
		p.property(); // Cash+Gold+land+House
		p.marry(); // Trisha 
		
		Child c=new Child();
		c.property(); // Cash+Gold+Land+House
		c.marry(); // Rashmika
		
		Parent p1=new Child();
		p1.property(); // Cash+Gold+Land+House
		p1.marry(); // Rashmika
		
	}
}

