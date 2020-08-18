package dp.factory;

interface Animal {
	void speack();
}

class D implements Animal {
	@Override
	public void speack() {
		System.out.println("Dog!");
	}
}

class C implements Animal {
	@Override
	public void speack() {
		System.out.println("Cat!");
	}
}

class Factory {
	public Animal getObj(String type) {
		switch (type) {
		case "d":
			return new D();
		case "c":
			return new C();
		default:
			return null;
		}
	}
}

public class Practise {
	public static void main(String... args) {
		Factory f = new Factory();
		f.getObj("d").speack();
		f.getObj("c").speack();
	}
}
