package Lab2;
import java.util.*;

abstract class Item {
	private int identification_number;
	private String title;
	private int no_of_copies;
	public int getIdentification_number() {
		return identification_number;
	}
	public void setIdentification_number(int identification_number) {
		this.identification_number = identification_number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNo_of_copies() {
		return no_of_copies;
	}
	public void setNo_of_copies(int no_of_copies) {
		this.no_of_copies = no_of_copies;
	}
	
}

public class Lab2_1 extends Item {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int a, b;
		String c;
		Item obj = new Lab2_1();
		System.out.print("Enter The Id Number: ");
		a = in.nextInt();
		System.out.print("Enter The Title: ");
		c = in.next();
		System.out.print("Enter The No_Of_Copies: ");
		b = in.nextInt();
		obj.setIdentification_number(a);
		obj.setTitle(c);
		obj.setNo_of_copies(b);
		System.out.println(obj.getIdentification_number());
		System.out.println(obj.getTitle());
		System.out.println(obj.getNo_of_copies());
		in.close();
	}

}
