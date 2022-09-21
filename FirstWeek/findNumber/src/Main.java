
public class Main {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 5, 7, 9, 0};
		boolean isNumberInArray = false;
		int numberToFind = 5;
		

		for (int number : numbers) {
			if(number == numberToFind) {
				isNumberInArray = !isNumberInArray;
				break;
			}
		}
		
		if(isNumberInArray)
			System.out.println("The number is present in array");
		else
			System.out.println("The number isn't present in array");
		

	}

}
