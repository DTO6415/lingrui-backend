public class Float_Precision {
	public static void main(String[] args) {
		System.out.println(0.01 * 100);

		float result = 0.0f;
		for (int i = 0; i < 100; i++) {
			result += 0.01f;
		}
		System.out.println(result);
	}
}
