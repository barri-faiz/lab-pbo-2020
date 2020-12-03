import java.util.*;

public class Main {
	public static void main(String[] args) {
		int x;
		int pilihan = 0;

		Bus b1 = new Bus();
        Scanner input = new Scanner(System.in);

        System.out.println("===== BUS TRANS KOETA RADJA =====");
        System.out.println("MENU");
        System.out.println("1. Naikkan Penumpang");
        System.out.println("2. Turunkan Penumpang");
        System.out.println("3. Lihat Penumpang");
        System.out.print("Pilihan : ");
        x = input.nextInt();

        while (x != 4) {
        	switch (x) {
        		case 1:
        			while(pilihan != 2 ){
        			System.out.print("Nama\t: ");
                	String nama = input.next(); 
                	System.out.print("Umur\t: ");
               		int umur = input.nextInt();
                	System.out.print("Hamil (y/n) : "); 
                	Boolean hamil = new Scanner(System.in).nextLine().equalsIgnoreCase("Y")?true:false;

                	Penumpang penumpang = new Penumpang(nama, umur, hamil);
                	b1.NaikPenumpang(penumpang);
                	b1.toString();
                	System.out.print("Naikkan lagi? (1.YES/2.NO) : ");
                 	pilihan = input.nextInt();
                	System.out.println("=================================");
                 	}
                 	break;
            	case 2:
            		System.out.print("\nNama\t: ");
                	String nama = input.next();
                	b1.turunkanPenumpang(nama);
                	b1.toString();
                	System.out.println("=================================");
    	           	break;
                case 3:
                    b1.toString(); 
                	System.out.println("=================================");
                	break;
                default:
                    System.out.println("Pilihan tidak ada!");
           }
       }
   }
}
