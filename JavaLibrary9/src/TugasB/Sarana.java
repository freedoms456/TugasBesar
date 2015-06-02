
package TugasB;

import java.util.Scanner;

public class Sarana extends kelasabstrak{
    Scanner input;
    Kelas l = new Kelas();
    @Override
    void Input(){
         input= new Scanner (System.in);
             System.out.println("pilih Jumlah Stop Kontak/Steker : 1.0 2.1-2 3.>2");
              l.setJumlahSteker(input.nextInt())  ;
             System.out.println("Pilih Kondisi Stop Kontak/Steker : 1.buruk 2.Bagus");
              l.setKondisiSteker(input.nextInt());
             System.out.println("pilih Posisi Steker :1.tidak ada yang dekat meja dosen 2.Ada yang Dekat Meja Dosen");
               l.setPosisiSteker(input.nextInt());
             System.out.println("Pilih Jumlah Kabel LCD: 1.0 2.>=1 ");
              l.setJumlahLCD(input.nextInt())  ;
             System.out.println("Pilih Kondisi Kabel LCD : 1.buruk 2.Bagus");
              l.setKondisiLCD(input.nextInt());
             System.out.println("pilih Posisi LCD :1.tidak ada yang dekat meja dosen 2.Ada yang Dekat Meja Dosen");
               l.setPosisiLCD(input.nextInt());
               System.out.println("pilih Jumlah Lampu : 1.0 2.1-2 3.>2");
              l.setJumlahLampu(input.nextInt())  ;
             System.out.println("Pilih Kondisi Lampu : 1.buruk 2.Bagus");
              l.setKondisiLampu(input.nextInt());
             System.out.print("pilih Posisi Lampu :1.pinggir 2.Tengah");
            
             
               l.setPosisiLampu(input.nextInt());
              System.out.println("pilih Jumlah Kipas Angin : 1.0 2.1-2 3.>2");
              l.setJumlahKipasAngin(input.nextInt())  ;
             System.out.println("Pilih Kondisi Kipas Angin : 1.buruk 2.Bagus");
              l.setKondisiKipasAngin(input.nextInt());
             System.out.println("pilih Posisi Kipas Angin :1.pinggir 2.tengah");
               l.setPosisiKipasAngin(input.nextInt());
               System.out.println("pilih Jumlah AC : 1.0 2.1 3.>1");
              l.setJumlahAC(input.nextInt())  ;
             System.out.println("Pilih Kondisi AC : 1.buruk 2.Bagus");
              l.setKondisiAC(input.nextInt());
             System.out.println("pilih Posisi AC :1.Belakang 2.Samping");
               l.setPosisiAC(input.nextInt());
              System.out.println("Input nama SSID");
               l.setSSID(input.next());
             System.out.println("Input kecepatan Bandwidth :1.<1mb 2 1-5 Mb 3.>5Mb");
              l.setBandwidth(input.nextInt());
             System.out.println("pilih Jumlah CCTV : 1.tidak ada 2.1 cctv 3.2 cctv");
              l.setJumlahCCTV(input.nextInt())  ;
             System.out.println("Pilih Kondisi CCTV : 1.buruk 2.Bagus");
              l.setKondisiCCTV(input.nextInt());
              System.out.println("Pilih posisi:1.tengah 2.depan/Belakang");
           
               l.setPosisiCCTV(input.nextInt());
    }
    
    @Override
    int Analisis(){
         l.setHasilJumlahKondisi( l.getJumlahSteker()+ l.getKondisiSteker()+ l.getPosisiSteker()+ l.getJumlahLCD()
            + l.getKondisiLCD()+ l.getJumlahLampu()+ l.getKondisiLampu()+ l.getKondisiKipasAngin()+ l.getJumlahKipasAngin()
            + l.getJumlahAC()+ l.getKondisiAC()+ l.getBandWith()+ l.getJumlahCCTV()+ l.getKondisiCCTV());
            if( l.getHasilJumlahKondisi()>27){
                System.out.println(" Baik");
            }  
            else{
                System.out.println("Buruk");
            }
            return 1;
    }
    
    @Override
    void Output(){
     
            System.out.print("Sarana kelas = ");  
        Analisis();
    }
    
}
