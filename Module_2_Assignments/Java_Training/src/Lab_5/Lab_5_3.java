package Lab_5;
import java.util.*;
public class Lab_5_3 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		for(int i = 2; i < number ; i++){
			int flag = 1;
			for(int j = 2; j < i; j++){
				if(i % j == 0)
					flag = 0;
				if(flag == 0){
					break;
				}

			}
			if(flag == 1){
				System.out.println(i);
			}
		}
		sc.close();
	}

}
