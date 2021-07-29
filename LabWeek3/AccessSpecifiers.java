package knightingale;
public class AccessSpecifiers {
	private class a{
		int B()
		{
			return 123;
		}
	}
	protected class base {
		String Method() {
			return "Wow";
			}
			}
			class dervied {
			public void useD() {
			base z = new base();
			System.out.println("base says, " + z.Method());
			}
			}

	public static void main(String[] args) {
		base b1=new base();
		b1.Method();
		a a1=new a();
		a1.B();
	}

}
