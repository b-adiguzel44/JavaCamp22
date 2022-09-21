package recapDemo1;

public class Main {

	public static void main(String[] args) {
		
		int number1 = 266;
		int number2 = 25;
		int number3 = 2;

		int theHighest = number1;
		
		if(theHighest < number2) {
			theHighest = number2;
		}
		
		if(theHighest < number3) {
			theHighest = number3;
		}

		
		System.out.println("The highest number : " + theHighest);
	}

}
