package Lab_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab_6_2 {

	public static void main(String[] args) throws FileNotFoundException {
		// File file = new File("src/Lab_6/testFile.txt");
		File file = new File("testFile.txt");
		Scanner sc = new Scanner(file);
		int i = 0;
		while (sc.hasNextLine()) {
			i += 1;
			System.out.println(sc.nextLine()+" " + i);
		}
			 
		sc.close();

	}

}
