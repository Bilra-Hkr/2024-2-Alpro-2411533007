package pekan5;

public class TugasFor1 {

	public static void main(String[] args) {
		for (int i=1; i<=1; i++) {
			System.out.println("#================#");
		}
	for (int baris = 1; baris <= 4; baris++) {
        System.out.print("|");
        for (int jarak = 1; jarak <= (baris * -2 + 8); jarak++) {
            System.out.print(" ");
        }
        System.out.print("<>");
        for (int titik = 1; titik <= (baris * 4 - 4); titik++) {
            System.out.print(".");
        }
        System.out.print("<>");
        for (int jarak = 1; jarak <= (baris * -2 + 8); jarak++) {
            System.out.print(" ");
        }
        System.out.println("|");
     }
	for (int baris = 1; baris <= 4; baris++) {
        System.out.print("|");
        for (int jarak = 1; jarak <= (baris * 2 - 2); jarak++) {
            System.out.print(" ");
        }
        System.out.print("<>");
        for (int titik = 1; titik <= (baris* -4 + 16); titik++) {
            System.out.print(".");
        }
        System.out.print("<>");
        for (int jarak = 1; jarak <= (baris * 2 - 2); jarak++) {
            System.out.print(" ");
        }
        System.out.println("|");
     }
		for (int i=1; i<=1; i++) {
		System.out.print("#================#");
		}

	}

}
