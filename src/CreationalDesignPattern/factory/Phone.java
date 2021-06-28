package CreationalDesignPattern.factory;

public interface Phone {
	void showPhone();
}

class Android implements Phone {
	@Override public void showPhone() {
		System.out.println("Android - Open source");
	}
}

class Ios implements Phone {
	@Override public void showPhone() {
		System.out.println("IOS - Closed source");
	}
}

class Windows implements Phone {
	@Override public void showPhone() {
		System.out.println("Windows - microsoft OS");
	}
}
