package StructuralDesignPattern.Adapter;

public class AdapterPatternTest {
	public static void main(String[] args) {

		Assignment assignment = new Assignment();
		assignment.setPen(new PenAdapter());
		assignment.writeUrAssignment("write assignment using my friend's pen");

	}
}
