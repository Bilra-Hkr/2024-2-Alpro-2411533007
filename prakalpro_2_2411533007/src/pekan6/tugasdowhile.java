package pekan6;

import java.util.Random;
import java.util.Scanner;

public class tugasdowhile {

	public static void main(String[] args) {
		Random rand = new Random();
		boolean running = true;
		Scanner console = new Scanner (System.in);
		int sum;
		int count = 0;

		while (running) {
			int dice1 = rand.nextInt(6) + 1;
			int dice2 = rand.nextInt(6) + 1;
			sum  = dice1 + dice2;
			System.out.println(dice1 + " + " + dice2 + " = " + sum);
			count++;
			
			if (sum == 7) { 
				System.out.println("Selamat! Tebakan Anda Benar!");
				System.out.println("Anda menang setelah " + count + " percobaan!");
				break;
			} else {
				System.out.println("Tebakan Anda Salah!");
				System.out.print("Apakah Anda ingin melempar dadu lagi (ya/tidak)? ");
				String jawab1 = console.nextLine().toLowerCase();
				
				 if (!jawab1.equals("ya")) {
	                    running = false;
	             System.out.println("Anda gagal menang setelah " + count + " percobaan.");       
			} 
		}
	}
	}
}