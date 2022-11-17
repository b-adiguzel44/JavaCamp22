public class CustomerManager {
	
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger baseLogger) {
		this.logger = baseLogger;
	}

	public void add() {
		System.out.println("Customer has been added");
		this.logger.log("Log mesaj");
	}
	
}