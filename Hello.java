import java.util.Scanner;

public class Hello{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
	  
	   // int hargaBuah = 1000;
	   // String namaBuah = "apel";
	   // char singkatan = 'A';
	   // boolean tersedia = true;
	   // float beratbuah =  1;

	   //  System.out.println(hargaBuah);
	   //  System.out.println(namaBuah);
	   //  System.out.println(singkatan);s
	   //  System.out.println(tersedia);
	   //  System.out.println(beratbuah);	


	    String kalimat;
	    System.out.print("Masukan kalimat :");
	    kalimat = sc.nextLine();

	    System.out.print("kalimat yang anda masukkan adalah :" + kalimat);

	}
}