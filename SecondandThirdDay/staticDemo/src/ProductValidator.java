public class ProductValidator {

	
	static {
		System.out.println("Static structure ran");
	}
	
	public ProductValidator() {
		
	}
	
	public static boolean isValid(Product product) {
		
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
		}
		return false;
	}
	
	public void function() {
		
	}
	
	
}