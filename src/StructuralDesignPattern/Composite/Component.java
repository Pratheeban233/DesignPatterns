package StructuralDesignPattern.Composite;

import java.util.ArrayList;
import java.util.List;

public interface Component {
	void showPrice();
}

class Leaf implements Component {
	private final String name;
	private final int price;

	public Leaf(String name,int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public void showPrice() {
		System.out.println(name + " : " + price);
	}
}

class Composite implements Component {
	List<Component> components= new ArrayList<>();
	private final String name;

	public Composite(String name) {
		this.name = name;
	}
	public void addComponent(Component component) {
		components.add(component);
	}
	@Override
	public void showPrice() {
		System.out.println(name);
		for (Component c : components) {
			c.showPrice();
		}
	}
}