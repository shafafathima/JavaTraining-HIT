package LabWeek2;
import java.util.Scanner;
public class OddEven {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter a number:");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		if ( num % 2 == 0 )
		System.out.println(num+ " is even");
		else
		System.out.println(num+ " is odd");
	}

}
