package DesignPatterns.Singleton;

class MakeACaptain {
	private static MakeACaptain _captain;

	// We make the constructor private to prevent the use of "new"
	private MakeACaptain() {
	}

	public static MakeACaptain getCaptain() {
		// Lazy initialization
		if (_captain == null) {
			_captain = new MakeACaptain();
			System.out.println("New Captain selected for our team\n");
		} else {
			System.out.print("You already have a Captain for your team.");
			System.out.println("Send him for the toss.\n");
		}

		return _captain;
	}
}

public class SingletonPatternEx {
	public static void main(String[] args) {
		System.out.println("***Singleton Pattern Demo***\n");

		System.out.println("Trying to make a captain for our team\n");
		MakeACaptain c1 = MakeACaptain.getCaptain();

		System.out.println("Trying to make another captain for our team\n");
		MakeACaptain c2 = MakeACaptain.getCaptain();

		if (c1 == c2) {
			System.out.println("c1 and c2 are same instance");
		}

		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode() == c2.hashCode());
		System.out.println(c1.hashCode());
	}
}
