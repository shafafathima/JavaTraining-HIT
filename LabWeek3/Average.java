package knightingale;
import java.util.Scanner;
public class Average {
	
	public static double avg(int a[],int n)
	{
		int sum=0;
		for(int i=0; i<n;i++)
		{
			sum=sum+a[i];
			
		}
		return(sum/n);
	}

	public static void main(String[] args) {
		double average=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter N");
		int n = scanner.nextInt();
		int[] array = new int[10];
		System.out.println("Enter "+n+" numbers to find average");
		for(int i=0;i<n;i++)
		{
			array[i] = scanner.nextInt();
		}
		 average=avg(array,n);
		 System.out.println("The average is: "+average);	

	}

}
