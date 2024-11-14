package pekan5;

import java.util.Scanner;

public class perulanganFor4 {

	public static void main(String[] args) {
		int batas;
		int jumlah = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Input nilai batas = ");
		batas = input.nextInt(); 
		input.close();
		
		for (int i=1; i<=batas; i++) {
			System.out.print(i);
			jumlah = jumlah + i;
			if (i<batas) {
				System.out.print(" + ");
			} else {
				System.out.println();
				System.out.println("Jumlah = " + jumlah); 
			}
		}
	}
}
