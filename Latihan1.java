import java.util.Scanner;

public class Latihan1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        String VariableA, VariableB, temp;

        System.out.print("Beri Nilai Variable A: ");
        VariableA = sc.nextLine();
        System.out.print("Beri Nilai Variable B: ");
        VariableB = sc.nextLine();

        System.out.println("NIlai Variable A: " + VariableA);
        System.out.println("NIlai Variable B: " + VariableB);

        temp = VariableA;
        VariableA = VariableB;
        VariableB = temp;

        System.out.println("New NIlai Variable A: " + VariableA);
        System.out.println("New NIlai Variable B: " + VariableB);



	}
}