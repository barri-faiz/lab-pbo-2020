import java.util.Scanner;

public class prak2lat8 {
	public static void main(String[] args) {
		int age = 0;
		Scanner sc = new Scanner (System.in);

		System.out.print("Masukkan umur anda : ");
		age = sc.nextInt ();

		if (age>=17)
			System.out.println ("Anda sudah boleh buat KTP");
	}
}

// Code diatas bertujuan untuk mencoba seleksi if