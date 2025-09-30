import java.util.Scanner;


public class Latihan3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        float keliling, luas, jari;
        float pi = 3.14f;

        System.out.print("Masukan panjang jari-jari: ");
        jari = sc.nextFloat();

        keliling = 2 * pi * jari;
        luas = pi * jari * jari;

        System.out.println("Luas lingkaran adalah: " + luas);
        System.out.println("Keliling lingkaran adalah: " + keliling);

	}
}


