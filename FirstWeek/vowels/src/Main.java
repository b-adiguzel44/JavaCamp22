
public class Main {

	public static void main(String[] args) {

		char letter = '2';

		switch (letter) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Bold Vowels");
				break;
			case 'E':
			case 'i':
			case 'ö':
			case 'ü':
				System.out.println("Thin Vowels");
				break;
			default:
				System.out.println("Invalid letter");
		}

	}

}
