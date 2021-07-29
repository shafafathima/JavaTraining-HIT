package knightingale;

public class NegativePositive {

	public static void main(String[] args) {
		int i=123;
		int j=-123;
		j = (j < 0 ? j : -j);
		if(i==j)
		{
			System.out.println("Numbers are same");
		}
		else
		{
			System.out.println("Numbers are not same");
		}

	}

}
