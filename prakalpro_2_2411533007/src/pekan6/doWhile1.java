package pekan6;

import java.util.Scanner;

public class doWhile1 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
			String phrase;
			do {
				System.out.println("Input Passowrd: ");
				phrase = console.next();
			} while (!phrase.equals("abcd"));
	}

}
