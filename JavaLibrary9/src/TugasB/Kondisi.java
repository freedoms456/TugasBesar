
package TugasB;

import java.util.Scanner;

public class Kondisi extends kelasabstrak{
    Scanner input;
    Kelas l = new Kelas();
    @Override
    void Input(){
        
        input = new Scanner (System.in);
       
   System.out.print("Pilih Panjang Ruang :1.0-2m 2.2-3m 3.>3m  ");
    l.setPanjangRuang(input.nextInt());
   System.out.print("Pilih Lebar Ruang:1.0-1m 2.1-2m 3.>2m  ");
    l.setLebarRuang(input.nextInt()); 
   System.out.print("Pilih Jumlah Kursi:1.0-10 2.10-25 3.>25  ");
    l.setJumlahKursi(input.nextInt());
   System.out.print("Pilih Jumlah Pintu : 1.0 2.1 ");
    l.setJumlahPintu(input.nextInt());
   System.out.print("Pilih Jumlah Jendela : 1.0-1 2.2-3 3.>3 ");
    l.setJumlahJendela(input.nextInt()); 
    }
    @Override
    public int Analisis(){
         l.setHasilKondisi(  l.getJumlahJendela()+ l.getPanjangRuang()+ l.getLebarRuang()+ l.getJumlahKursi()+ l.getJumlahPintu());
   if( l.getHasilKondisi() >8){
       System.out.print(" Baik");
       return 1;
   }
   else{
       System.out.print("Buruk");
   }
   return 0;
        
    }
    @Override
    void Output(){
        System.out.print("Kondisi Kelas =");
                Analisis();
    }
    
}
