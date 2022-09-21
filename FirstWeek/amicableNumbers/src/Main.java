
public class Main {

	public static void main(String[] args) {
		
		// 220 - 284 -> Amicable Numbers
		
		int number = 220;
		int number2 = 284;
		
		int sum = 0;
		int sum2 = 0;
		
		for(int i = 1; i < number; i++) {
			if(number % i == 0)
				sum += i;
		}
		
		for(int i = 1; i < number2; i++) {
			if(number2 % i == 0)
				sum2 += i;
		}
		
		if(sum == number2 && sum2 == number)
			System.out.println("Amicable Numbers : " + number + " and " + number2);
		else
			System.out.println("Not amicable numbers.");

	}

}
