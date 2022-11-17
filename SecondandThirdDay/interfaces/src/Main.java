public class Main {

	public static void main(String[] args) {
		
			//ICustomerDal customerDal = new OracleCustomerDal();
			CustomerManager customer = new CustomerManager(new MySqlCustomerDal());
			customer.add();
		
		
	}

}