package Lab_5;

import java.util.*;

public class Lab_5_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		int temp = 1;
		int fibo = 0;

		for (int i = 1; i <= number; ++i)
        {
            System.out.print(fibo + "  ");
            int sum = fibo + temp;
            fibo = temp;
            temp = sum;
        }

		sc.close();

	}

}
