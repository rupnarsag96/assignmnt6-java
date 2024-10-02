/*
5. Create classes for a Car and an Engine. The Car class should contain an instance of
 the Engine class. Implement methods to start and stop the car, and display engine details.
 */
package Assignment6;

public class TestEngine {
	public static void main(String[] args) {
		Engine engine = new Engine("Skoda", 617);
		engine.start();
		engine.stop();
		engine.display();

		System.out.println("=======================================");
		Car car = new Car("Celerio", "Maruti Suzuki", engine);
		car.start();
		car.stop();
		System.out.println("=========================================");
		car.carDisplay();
	}
}