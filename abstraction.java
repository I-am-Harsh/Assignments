package project1;
import java.util.*;
abstract class Shape
{
	abstract void draw();
}
class newCircle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("Drawing circle");
	}
}
abstract class Triangle extends Shape
{
	
}
class uppertriangle extends Triangle
{
	@Override
	void draw()
	{
		System.out.println("Drawing Uppertriangle");
	}

}
class lowertriangle extends Triangle
{
	@Override
	void draw()
	{
		System.out.println("Drawing Lowertriangle");
	}

}
public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
newCircle c= new newCircle();
uppertriangle u=new uppertriangle();
lowertriangle l=new lowertriangle();
c.draw();
l.draw();
u.draw();
	}

}
