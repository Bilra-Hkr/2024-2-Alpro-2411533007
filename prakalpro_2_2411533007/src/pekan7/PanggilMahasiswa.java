package pekan7;

public class PanggilMahasiswa {

	public static void main(String[] args) {
		Mahasiswa a = new Mahasiswa();
		a.setNim(23532);
		a.setNama("Rahmat");
		System.out.println(a.getNim());
		System.out.println(a.getNama());
		a.Cetak();
	}
}
