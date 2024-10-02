package Assignment6;

public class Engine {
	private String model;
	private int horsepower;
	private boolean isRunning;

	public Engine(String model, int horsepower) {
		super();
		this.model = model;
		this.horsepower = horsepower;
		this.isRunning = false;
	}

	public void start() {
		isRunning = true;
		System.out.println("Engine will be start working");
	}

	public void stop() {
		isRunning = false;
		System.out.println("Engine will be stop working");
	}

	public void display() {
		System.out.println("Model=" + model);
		System.out.println("Housepower=" + horsepower);
		System.out.println("Is Running " + (isRunning ? "Yes" : "No"));
	}
}