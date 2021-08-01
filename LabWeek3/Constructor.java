package knightingale;


public class Constructor {
	int a;
	int b;
	int c;
	public Constructor(int a, int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public final int getA()
	{
		return a;
	}
	public final int getB()
	{
		return b;
	}
	public final int getC()
	{
		return c;
	}
	public static void main(String[] args) {
		Constructor obj=new Constructor(10,20,30);
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		System.out.println(obj.getC());
		
		

	}

}
