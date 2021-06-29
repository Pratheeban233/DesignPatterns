package CreationalDesignPattern.singleton;

public class Singleton {

	private static Singleton obj;

	private Singleton() {
		System.out.println("Object Created.");
	}

	public static /*synchronized*/ Singleton getInstance() {
		if (obj == null) {
			synchronized (Singleton.class) {  //double checked locking
				if (obj == null)
					obj = new Singleton();

			}
		}
		return obj;
	}
}
