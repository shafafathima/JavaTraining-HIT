package knightingale;
import java.util.Arrays;
public class Resize {

	public static void main(String[] args) {
		int[] a = new int[] {1, 2, 3};
	    a = Arrays.copyOf(a, a.length + 1);
	    for (int i : a)
	        System.out.println(i);
	}

}
