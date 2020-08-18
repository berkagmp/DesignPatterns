package dp.strategy.ex1;

public class Context {
	IChoice myC;

	public Context() {
	}

	public Context(IChoice ic) {
		myC = ic;
	}

	// Set a Strategy or algorithm in the Context
	public void SetChoice(IChoice ic) {
		myC = ic;
	}

	public void ShowChoice(String s1, String s2) {
		myC.myChoice(s1, s2);
	}
}
