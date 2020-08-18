package dp.adapter.ex1;

/*
 * Calculate the area of a Triangle using CalculatorAdapter. Please note here:
 * this time our input is a Triangle.
 */
public class CalculatorAdapter {
	Calculator calculator;
	Triangle triangle;

	public double getArea(Triangle t) {
		calculator = new Calculator();
		triangle = t;

		// Area of Triangle=0.5*base*height
		Rect r = new Rect(triangle.b, (0.5 * triangle.h));

		return calculator.getArea(r);
	}
}
