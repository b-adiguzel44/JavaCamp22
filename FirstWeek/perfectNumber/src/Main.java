
public class Main {

	public static void main(String[] args) {
		
		int number = 87;
		int sum = 0;
		
		for(int i = 1; i < number; i++) {
			if(number % i == 0) {
				sum += i;
			}
		}
		
		if(sum == number) 
			System.out.println("PERFECT NUMBER!");
		else
			System.out.println("Not a Perfect Number");

	}

}
