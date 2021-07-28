package knightingale;

public class TestConstructor {
	TestConstructor(int n)
	{
		System.out.println(n++);
	}

	public static void main(String[] args) {
		TestConstructor t1 = new TestConstructor(111);  
		TestConstructor t2 = new TestConstructor();  

	}

}
