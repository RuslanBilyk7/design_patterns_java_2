package abstractfactory.banking;

import abstractfactory.Developer;


public class JavaDeveloper implements Developer {

	@Override
	public void writeCode() {
		System.out.println("Java developer writes java code...");
	}
}
