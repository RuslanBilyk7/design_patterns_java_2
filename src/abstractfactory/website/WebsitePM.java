package abstractfactory.website;

import abstractfactory.ProjectManager;


public class WebsitePM implements ProjectManager {

	@Override
	public void manageProject() {
		System.out.println("Website PM manages project...");
	}
}