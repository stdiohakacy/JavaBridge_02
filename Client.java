package structual.Bridge._02;

public class Client {
	public static void main(String[] args) {
		Shape rectangle = new Rectangle(new Red());
		rectangle.draw();
	}
}
