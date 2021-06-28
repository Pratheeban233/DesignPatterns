package CreationalDesignPattern.builder;

public class PhoneBuilder {
	private String os;
	private int ram;
	private double screenSize;
	private int price;

	public PhoneBuilder setOs(String os) {
		this.os=os;
		return this;
	}

	public PhoneBuilder setRam(int ram) {
		this.ram=ram;
		return this;
	}

	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize=screenSize;
		return this;
	}

	public PhoneBuilder setPrice(int price) {
		this.price=price;
		return this;
	}

	public Phone getPhone() {
		return new Phone(os,ram,screenSize,price);
	}
}
