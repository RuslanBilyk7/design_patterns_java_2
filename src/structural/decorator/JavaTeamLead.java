package structural.decorator;

public class JavaTeamLead extends DeveloperDecorator {

	public JavaTeamLead(final Developer developer) {
		super(developer);
	}

	public String sendWeekReport() {
		return "send week report to customer\n";
	}

	@Override
	public String makeJob() {
		return super.makeJob() + sendWeekReport();
	}
}
