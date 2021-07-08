package LabWeek2;

public class LargestAmongThree {
	public static void main(String[] args) {
	int a = 45, b = 69, c = 23;
	if( a >= b && a >= c)
	System.out.println(a + " is the largest number.");
	else if (b >= a && b >= c)
	System.out.println(b + " is the largest number.");
	else
	System.out.println(c + " is the largest number.");
	}
}
