package switchDemo;

public class Main {

	public static void main(String[] args) {

		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("Perfection : Passed");
			break;
		case 'B':
		case 'C':
			System.out.println("Good : Passed");
			break;
		case 'D':
			System.out.println("Not Bad : Passed");
			break;
		case 'F':
			System.out.println("Bad : Failed");
			break;
		default:
			System.out.println("Invalid letter grade!");

		}

	}

}
