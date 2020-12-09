package creational.singletone;

public class ProgramRunner {

	public static void main(String[] args) {
		//		ProgramLogger programLogger=new ProgramLogger();
		ProgramLogger logger = ProgramLogger.getProgramLogger();
		logger.addLogInfo("First log..");
		logger.addLogInfo("Second log..");
		logger.addLogInfo("Third log..");

		logger.showLogFile();
	}

}
