package project1;

public abstract class A {

	A()
	{
		System.out.println("A created");
	}
	void m1()
	{
		System.out.println("m1 from A");
	}
	abstract void m2();
	
	static void m3()
	{
		System.out.println("m3 from A");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m3();
	}

}
