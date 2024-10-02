package Assignment6;

public class Car {

	private String brand;
	private String model;
	private Engine engine;

	public Car(String brand, String model, Engine engine) {
		super();
		this.brand = brand;
		this.model = model;
		this.engine = engine;
	}

	public void start() {
		engine.start();
		System.out.println(model + " " + brand + " is starting");
	}

	public void stop() {
		engine.stop();
		System.out.println(model + " " + brand + " is stop");
	}

	public void carDisplay() {
		System.out.println("Showing Engine Details");
		engine.display();
	}
}