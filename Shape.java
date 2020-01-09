package structual.Bridge._02;

public abstract class Shape {
	protected IColor color;
	
	protected Shape(IColor color) {
		this.color = color;
	}
	
	abstract void draw();
}

class Rectangle extends Shape{

	protected Rectangle(IColor color) {
		super(color);
	}

	@Override
	void draw() {
		System.out.println("Rectangle draw with color " + this.color.getClass());
	}
	
}
