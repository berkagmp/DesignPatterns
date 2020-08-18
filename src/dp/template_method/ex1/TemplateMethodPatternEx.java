package dp.template_method.ex1;

class TemplateMethodPatternEx {
	public static void main(String[] args) {
		System.out.println("***Template Method Pattern Demo***\n");

		BasicEngineering bs = new ComputerScience(); // Abstract Class BasicEngineering, Inherited class ComputerScience
		System.out.println("Computer Sc Papers:");
		bs.Papers();

		System.out.println();

		bs = new Electronics(); // Abstract Class BasicEngineering, Inherited class Electronics
		System.out.println("Electronics Papers:");

		bs.Papers();
	}
}