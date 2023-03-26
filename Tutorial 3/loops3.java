public class loops3 {
	public static void main(String[] args) {
		for (int i = 2; i < 9; i += 2) {
			for (int j = 1; j <= i; j += 1) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}