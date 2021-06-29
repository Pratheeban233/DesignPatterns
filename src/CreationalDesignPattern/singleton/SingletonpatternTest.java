package CreationalDesignPattern.singleton;

public class SingletonpatternTest {

	public static void main(String[] args) {
//
//		Thread t1 = new Thread(() -> {
//			Singleton singleton = Singleton.getInstance();
//		});
//
//		Thread t2 = new Thread(() -> {
//			Singleton singleton = Singleton.getInstance();
//		});
//		t1.start();
//		t2.start();

		ABC abc = ABC.INSTANCE;
		abc.i = 5;
		abc.show();

		ABC abc1 = ABC.INSTANCE;
		abc1.i = 6;

		abc.show();

	}

}

enum ABC{
	INSTANCE;
	int i ;
	public void show(){
		System.out.println(i);
	}
}
