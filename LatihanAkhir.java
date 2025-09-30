import java.util.Scanner;

public class LatihanAkhir{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer bilangan1, bilangan2, hasil;
		Integer HasilPenjumlahan, HasilPerkalian, HasilPengurangan, HasilModulus;
		float HasilPembagian;

		System.out.print("Masukan bilangan 1: ");
		bilangan1 = sc.nextInt();

		System.out.	print("Masukan bilangan 2: ");
		bilangan2 = sc.nextInt();

		HasilPenjumlahan = bilangan1 + bilangan2;
		HasilPerkalian = bilangan1 * bilangan2;
		HasilPengurangan = bilangan1 - bilangan2;
		HasilPembagian = (float) bilangan1 / bilangan2;
		HasilModulus = bilangan1 % bilangan2;

		System.out.println("Hasil pertambahan " + bilangan1 + " + " + bilangan2 + " adalah " + HasilPenjumlahan);
		System.out.println("Hasil perkalian " + bilangan1 + " * " + bilangan2 + " adalah " + HasilPerkalian);
		System.out.println("Hasil pengurangan " + bilangan1 + " - " + bilangan2 + " adalah " + HasilPengurangan);
		System.out.println("Hasil pembagian " + bilangan1 + " / " + bilangan2 + " adalah " + HasilPembagian);
		System.out.println("Hasil modulus " + bilangan1 + " % " + bilangan2 + " adalah " + HasilModulus);

	}
}