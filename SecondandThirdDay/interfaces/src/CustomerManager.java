public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal database) {
		this.customerDal = database;
	}
	
	public CustomerManager() {
		
	}

	public void add() {
		this.customerDal.add();
	}
	
}