package DAY9.SESSION2;

public class StringBuilderDemo1 {
	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("Dhanush");
		System.out.println("before change:" + s1);
		s1.delete(0, 3);
		System.out.println("after deletion:" + s1);
	}
}
