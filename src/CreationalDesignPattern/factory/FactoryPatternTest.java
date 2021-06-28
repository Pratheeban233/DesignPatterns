package CreationalDesignPattern.factory;

public class FactoryPatternTest {
	public static void main(String[] args) {
		PhoneFactory phoneFactory = new PhoneFactory();
		phoneFactory.getInstance("android").showPhone();
	}
}
