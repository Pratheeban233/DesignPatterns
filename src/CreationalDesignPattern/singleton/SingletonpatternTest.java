package CreationalDesignPattern.singleton;

public class SingletonpatternTest {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			Singleton singleton = Singleton.getInstance();
		});

		Thread t2 = new Thread(() -> {
			Singleton singleton = Singleton.getInstance();
		});
		t1.start();
		t2.start();
	}

}
