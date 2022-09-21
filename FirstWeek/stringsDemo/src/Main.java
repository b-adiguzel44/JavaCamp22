
public class Main {

	public static void main(String[] args) {
		
		String message = "       The weather is great today.         ";
		System.out.println(message);
		
//		System.out.println("length of message variable : " + message.length());
//		System.out.println("5th element : " + message.charAt(4));
//		System.out.println(message.concat(" Yay!"));
//		System.out.println(message.startsWith("T"));
//		System.out.println(message.endsWith("."));
//		char[] letters = new char[5];
//		message.getChars(0, 5, letters, 0);
//		System.out.println(letters);
//		
//		System.out.println(message.indexOf("at"));
//		System.out.println(message.lastIndexOf("a"));
		
		String newMessage = message.replace(' ', '-');
		
		System.out.println(newMessage);
		System.out.println(message.substring(4, 11));
		
		System.out.println("-----------");
		
		for (String string : message.split(" ")){
			System.out.println(string);
		}
		
		System.out.println("-----------");
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		
		System.out.println(message.trim());
		
	}

}
