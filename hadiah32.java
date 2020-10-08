import java.util.Scanner;
public class hadiah32 {
public static void main (String[] args) {
	Scanner masukan = new Scanner(System.in);
	String nama;
	String alamat;
	int umur;
	System.out.print("Masukkan nama  : ");
	nama = masukan.nextLine();
	System.out.print("Masukkan alamat: ");
	alamat = masukan.nextLine();
	System.out.print("Masukkan umur  : ");
	umur = masukan.nextInt();
	System.out.println();
	System.out.println("Saudara : " + nama);
	System.out.println("Berumur : " + umur);
	System.out.println("Tinggal di : " + alamat);
	}
}