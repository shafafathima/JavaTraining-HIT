package knightingale;
import java.util.Scanner;
public class Investment {

	public static void main(String[] args) {
		double percentage,x,finalamt,initial;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter Initial Investment Amount:");
		initial=input.nextDouble();
		System.out.println("How many years do you want to calculate for:");
		int years=input.nextInt();
		for(int i=0;i<years;i++)
		{
			System.out.println("Enter change in Value:");
			percentage=input.nextDouble();
			percentage=percentage+100;
			System.out.println("Enter 1 for Increase and 2 for Decrease:");
			int value=input.nextInt();
				if(value==1)
				{
					x=initial*percentage;
					finalamt=initial+x;
					System.out.println("Investment worth is :"+finalamt);
				}
				else
				{
					x=initial*percentage;
					finalamt=x-initial;
					System.out.println("Investment worth is: " +finalamt);
				}
				initial=finalamt;
				
	}
	}

} 
