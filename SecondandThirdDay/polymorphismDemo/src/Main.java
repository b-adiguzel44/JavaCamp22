import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
	
//		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new DatabaseLogger(), new Emaillogger(), new ConsoleLogger()};
//		
//		for(BaseLogger logger : loggers) {
//			logger.Log("Log mesaj");
//		}
		
		CustomerManager customManger = new CustomerManager(new DatabaseLogger());
		customManger.add();
		
		
	}
}