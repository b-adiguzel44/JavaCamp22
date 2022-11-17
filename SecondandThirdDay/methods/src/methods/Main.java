package methods;

public class Main {

	public static void main(String[] args) {
		numberToFind();
		numberToFind();
		numberToFind();
		numberToFind();
	}
	
	public static void numberToFind() {
		int numbers[] = new int[] {1,2,5,7,9,0};
		int numberToFind = 11;
		boolean isHere = false;
	
		for(int number : numbers) {
			if(number == numberToFind) {
				isHere = !isHere;
				break;
			}
		}
		
		if(isHere)
			sendMessage("Number is in the array: " + numberToFind);
		else
			sendMessage("Number isn't in the array: " + numberToFind);
		
	}
	
	public static void sendMessage(String text) {
		System.out.println(text);
	}

}
