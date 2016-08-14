public class Question5 {
	public void m1(String arg1) {
		arg1 = "Am i going to disappear";
	}

	public static void main(String[] str) {
		Question5 test = new Question5();
		String iAmOfAnArgumentiveNature = "I am born now";
		test.m1(iAmOfAnArgumentiveNature);
		System.out.println(iAmOfAnArgumentiveNature);
	}
}
