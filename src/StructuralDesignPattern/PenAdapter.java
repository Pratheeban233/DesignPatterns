package StructuralDesignPattern;

public class PenAdapter implements Pen {

	Pilotpen pilotpen = new Pilotpen();

	@Override
	public void write(String str) {
		pilotpen.mark(str);
	}
}
