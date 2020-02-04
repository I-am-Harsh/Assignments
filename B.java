package project1;

public class B extends A{
	
	B()
	{
		System.out.println("B created");
	}
	@Override
	void m2()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.m1();
		b.m2();
		m3();
	}

}
