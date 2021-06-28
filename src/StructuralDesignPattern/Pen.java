package StructuralDesignPattern;

public interface Pen {
	void write(String str);
}

class Assignment {
	private Pen pen;

	public Pen getPen() {
		return pen;
	}
	public void setPen(Pen pen) {
		this.pen=pen;
	}
	void writeUrAssignment(String str) {
			pen.write(str);
	}
}