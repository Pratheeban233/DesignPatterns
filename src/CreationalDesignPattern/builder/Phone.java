package CreationalDesignPattern.builder;

public class Phone {

	private final String os;
	private final int ram;
	private final double screenSize;
	private final int price;

	public Phone(String os,int ram,double screenSize,int price) {
		this.os=os;
		this.ram=ram;
		this.screenSize=screenSize;
		this.price=price;
	}

	@Override public String toString() {
		return "Phone{"+"os='"+os+'\''+", ram="+ram+", screenSize="+screenSize+", price="+price+'}';
	}
}
