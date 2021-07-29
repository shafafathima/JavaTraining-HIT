package knightingale;
public class ProtectedClass {
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
}

}
