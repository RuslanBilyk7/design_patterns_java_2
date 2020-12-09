package abstractfactory.badapproach;


public class WebsiteProject {

	public static void main(String[] args) {
		PhpDeveloper phpDeveloper=new PhpDeveloper();
		ManualTester manualTester=new ManualTester();
		ProjectManager projectManager=new ProjectManager();

		System.out.println("Creati ng project...");
		phpDeveloper.writeCode();
		manualTester.testCode();
		projectManager.manageProject();
	}
}
