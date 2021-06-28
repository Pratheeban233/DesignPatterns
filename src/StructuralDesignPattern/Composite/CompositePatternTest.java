package StructuralDesignPattern.Composite;

public class CompositePatternTest {

	public static void main(String[] args) {

		Component hd = new Leaf("HDD",4500);
		Component screen = new Leaf("screen",12000);
		Component speaker = new Leaf("Speaker",200);
		Component ram = new Leaf("ram",3000);

		Composite ph = new Composite("Peri");
		Composite cabinet = new Composite("Cabinet");
		Composite motherBoard = new Composite("motherBoard");
		Composite computer = new Composite("Computer");

		motherBoard.addComponent(ram);

		ph.addComponent(screen);
		ph.addComponent(speaker);
		cabinet.addComponent(hd);

		computer.addComponent(ph);
		computer.addComponent(cabinet);

		computer.showPrice();

	}
}
