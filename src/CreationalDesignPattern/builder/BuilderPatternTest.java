package CreationalDesignPattern.builder;

public class BuilderPatternTest {
	public static void main(String[] args) {
		Phone ph = new PhoneBuilder().setOs("android").setPrice(25000).getPhone();
		System.out.println(ph);
	}
}
