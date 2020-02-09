package Lab_4;

import java.util.*;
public class Lab_4_1 {

	public static void cubes(int number){
		// System.out.println(number);
		int sum = 0;
		String arr = String.valueOf(number);
		for(int i = 0; i < arr.length() ; i++){ 
			int digit = Character.getNumericValue(arr.charAt(i));
			// System.out.println(digit);
			sum += digit * digit * digit;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		sc.close();

		cubes(number);
	}

}
