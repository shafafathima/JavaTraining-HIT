package knightingale;
import java.util.Scanner;
public class MarksCalc {

	public static void main(String[] args) {
		int mark[][] = new int[3][3];
		int total [] = new int[3];
		int avg [] = new int [3];
		
		int sum=0;
		
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<mark.length;i++)
		{
			System.out.println("Enter Student "+(i+1)+" Marks");
			for(int j=0;j<mark[0].length;j++)
			{
				mark[i][j]=s.nextInt();
			}
			
		}
		

		for(int i=0;i<mark.length;i++)
		{
			for(int j=0;j<mark[0].length;j++)
			{
				sum = sum+mark[i][j];
			}
			total[i] = sum;
			sum =0;
			avg[i]=total[i]/3;
		}
		
		for(int i=0;i<avg.length;i++)
		{
			if(avg[i]>30)
			{
				System.out.println("Student "+(i+1)+ " result is Pass");
			}
			else
			{
				System.out.println("Student "+(i+1)+ " result is Fail");
			}
		}

	}

}
