package dp.builder.ex1;

public class BuilderPatternEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Builder Pattern Demo***\n");

		Director director = new Director();

		IBuilder carBuilder = new Car();
		IBuilder motorBuilder = new MotorCycle();

		// Making Car
		director.Construct(carBuilder);
		Product p1 = carBuilder.GetVehicle();
		p1.Show();

		// Making MotorCycle
		director.Construct(motorBuilder);
		Product p2 = motorBuilder.GetVehicle();
		p2.Show();
	}

}
