package loopDemo;

public class Main {

	public static void main(String[] args) {

		// For
		for (int i = 0; i <= 10; i += 2) {
			System.out.println(i);
		}

		System.out.println("Loop Done");

		int i = 1;
		// While
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}

		System.out.println("While Loop Done");

		// Do-While
		int j = 100;
		do {
			System.out.println("Logged");
			System.out.println(j);
			j += 2;
		} while (j < 10);

		System.out.println("Do While Loop Done");
	}

}
