package dp.template_method.ex1;

public abstract class BasicEngineering {
	// Papers() in the template method
	public void Papers() {
		// Common Papers:
		Math();
		SoftSkills();

		// Specialized Paper:
		SpecialPaper();
	}

	// Non-Abstract method Math(), SoftSkills() are //already implemented by
	// Template class
	private void Math() {
		System.out.println("Mathematics is a basic paper.");
	}

	private void SoftSkills() {
		System.out.println("SoftSkills is a basic paper.");
	}

	// Abstract method SpecialPaper() must be implemented in derived classes
	public abstract void SpecialPaper();
}