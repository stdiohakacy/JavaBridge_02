package structual.Bridge._02;

public interface IColor {
	public void fill();
}

class Red implements IColor{
	public void fill() {
		System.out.println("Red fill");
	}
}

class Blue implements IColor{
	public void fill() {
		System.out.println("Blue fill");
	}
}

class Green implements IColor{
	public void fill() {
		System.out.println("Green fill");
	}
}
