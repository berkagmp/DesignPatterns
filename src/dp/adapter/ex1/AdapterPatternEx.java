package dp.adapter.ex1;

public class AdapterPatternEx {
	public static void main(String[] args) {
		System.out.println("***Adapter Pattern Demo***");

		CalculatorAdapter cal = new CalculatorAdapter();
		Triangle t = new Triangle(20, 10);

		System.out.println("\nAdapter Pattern Example\n");
		System.out.println("Area of Triangle is :" + cal.getArea(t));

		Calculator calculator = new Calculator();
		Rect r = new Rect(20.0d, 10.0d);
		System.out.println("Area of Rect is: " + calculator.getArea(r));
	}
}
