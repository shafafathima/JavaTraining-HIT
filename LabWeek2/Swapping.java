package LabWeek2;

public class Swapping {

	public static void main(String[] args) {
		int first = 25, second = 45;
		System.out.println("***Before swap***");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
		int temp = first;
		first = second;
		second = temp;
		System.out.println("***After swap***");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);

	}

}
