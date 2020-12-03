import java.util.*;
import java.util.ArrayList;

public class Bus {
	ArrayList<Penumpang> penumpangBiasa;
	ArrayList<Penumpang> penumpangPrioritas;
	ArrayList<Penumpang> penumpangTotal;
	Scanner input = new Scanner(System.in);

	public Bus() {
		penumpangBiasa =  new ArrayList<Penumpang>();
       	penumpangPrioritas =  new ArrayList<Penumpang>();
       	penumpangTotal = new ArrayList<Penumpang>();
    }

    public ArrayList<Penumpang> getPenumpangBiasa() { 
    	for(Penumpang penumpang:penumpangBiasa) {
        	penumpang.getNama();
        	}
        return penumpangBiasa;
    }

    public ArrayList<Penumpang> getPenumpangPrioritas() { 
    	for(Penumpang penumpang : penumpangPrioritas) {
        	penumpang.getNama();
        	}
        return penumpangPrioritas;
    }

    public int getJumlahPenumpangBiasa() {
    	int pB = penumpangBiasa.size();
    	System.out.println("Penumpang Biasa : "+pB);
    	return pB;
    }

    public int getJumlahPenumpangPrioritas() {
    	int pP = penumpangPrioritas.size();
    	System.out.println("Penumpang Prioritas : "+pP);
    	return pP;
    }

    public int getJumlahPenumpangTotal() {
    	return penumpangBiasa.size() + penumpangPrioritas.size();
    }

    public boolean NaikPenumpang (Penumpang penumpang) {
    	int b=3, p=1;
    	if ((penumpangPrioritas.size()<p) && (penumpang.getUmur()<10 || penumpang.getUmur()>60) || (penumpang.getHamil()==true)) {
    		System.out.println("Penumpang prioritas "+penumpang.getNama()+" berhasil ditambahkan!");	
    		return penumpangPrioritas.add(penumpang);
    	}
    	else if(penumpangBiasa.size()<b) {
    		System.out.println("Penumpang biasa "+penumpang.getNama()+" berhasil ditambahkan!");
    		return penumpangBiasa.add(penumpang);
    	} else {
    		System.out.println("Penumpang "+penumpang.getNama()+" gagal ditambahkan!");
    		System.out.println("Bus sudah penuh");
    		return false;
    	}
   	}

   	public boolean turunkanPenumpang(String nama){
   		for (int i = 0; i < penumpangBiasa.size(); i ++) {  
           if(nama.equals(penumpangBiasa.get(i).getNama())){
              penumpangBiasa.remove(i);
              System.out.println("Penumpang biasa "+nama+" berhasil turun!");
             return penumpangBiasa.equals(nama);
           } 
        }
    	for (int i = 0; i < penumpangPrioritas.size(); i ++) {  
            if(nama.equals(penumpangPrioritas.get(i).getNama())){
              penumpangPrioritas.remove(i);
              System.out.println("penumpang prioritas "+nama+" berhasil turun!");
             return penumpangPrioritas.equals(nama);
            }
        }
        for (int i = 0; i < penumpangTotal.size(); i ++) {  
           if(( nama !=(penumpangPrioritas.get(i).getNama()) || (nama != penumpangBiasa.get(i).getNama()))){
                System.out.println("Tidak Ada penumpang "+nama); 
               return false;
           }
       }
       return penumpangPrioritas.equals(nama);
    }

    public ArrayList<Penumpang> penumpangTotal(){
    	penumpangTotal = penumpangBiasa;
    	penumpangTotal.addAll(penumpangPrioritas);
    	System.out.println("Total penumpang : ");
    	for (Penumpang penumpang : penumpangTotal) {
    		System.out.print(penumpang.getNama()+", ");
    	}
    	return penumpangTotal;
    }

     public String toString(){
           String result1 = " ";
           String result2 = " ";

           for(Penumpang penumpang : penumpangBiasa) {
               result1 += penumpang.getNama().toString(); 
            }
           for(Penumpang penumpang : penumpangPrioritas) {
               result2 += penumpang.getNama().toString();
 			}

 			if (penumpangBiasa.isEmpty()==true) {
 				System.out.println("Penumpang biasa = kosong");
 			}else{
 				System.out.println("Penumpang biasa = "+result1);
 			}

 			if (penumpangPrioritas.isEmpty()==true) {
 				System.out.println("Penumpang prioritas = kosong");
 			}else{
 				System.out.println("Penumpang prioritas = "+result2);
 			}

 			System.out.println("Total penumpang = "+getJumlahPenumpangTotal());

 		return "Penumpang biasa = "+result1+ "Penumpang prioritas = "+result2+ "Total penumpang = "+getJumlahPenumpangTotal();
 	}
 }