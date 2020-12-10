package structural.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {

	public SeniorJavaDeveloper(final Developer developer) {
		super(developer);
	}

	public String makeCodeReview() {
		return "make code review\n";
	}

	@Override
	public String makeJob() {
		return super.makeJob() + makeCodeReview();
	}
}
