package structural.adapter;

public class DatabaseRunner {

	public static void main(String[] args) {
		//		Database database = null;  before pattern
		Database database = new AdapterJavaToDatabase();

		database.insert();
		database.update();
		database.select();
		database.remove();
	}
}
