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

abstract class WrittenItem extends Item {
	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}

public class Lab2_2 extends WrittenItem {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		WrittenItem obj = new Lab2_2();
		System.out.print("Enter The Id No: ");
		int b = in.nextInt();
		obj.setIdentification_number(b);
		System.out.print("Enter The Title :");
		String a = in.next();
		obj.setTitle(a);
		System.out.print("Enter The Number Of Copies: ");
		b = in.nextInt();
		obj.setNo_of_copies(b);
		System.out.print("Enter The Author Name: ");
		a = in.next();
		obj.setAuthor(a);
		System.out.println("Id No: " + obj.getIdentification_number());
		System.out.println("Name: " + obj.getTitle());
		System.out.println("No Of Copies: " + obj.getNo_of_copies());
		System.out.println("Author: " + obj.getAuthor());
		in.close();
	}
}
