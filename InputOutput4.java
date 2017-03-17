import java.util.Scanner;

public class InputOutput4 {
public static void main (String[] args) {
Scanner input = new Scanner (System.in);
		String nama;
		char JenisKelamin;
		int TinggiBadan;
		boolean menikah;
		
System.out.print("masukan nama : ");
nama = input.nextLine();
System.out.print("Masukan Jenis Kelamin : ");
JenisKelamin = input.next().charAt(0);
System.out.print("masukan Tinggi Badan : ");
TinggiBadan = input.nextInt();
System.out.print("masukan status Menikah : ");
menikah = input.nextBoolean();
}

}