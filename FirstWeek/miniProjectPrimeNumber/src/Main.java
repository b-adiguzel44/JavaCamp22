
public class Main {

	public static void main(String[] args) {
		

		int number = 25;
		boolean isPrime = true; 
		
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				isPrime = !isPrime;
				break;
			} 
		}
		if(number == 1) {
			System.out.println("Not a prime number.");
		}
		else if(isPrime) {
			System.out.println("Is a prime number.");
		}
		else {
			System.out.println("Not a prime number.");
		}
		
	}

}
