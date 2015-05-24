
package TugasB;

import java.util.Scanner;

class induk{
    void posisi(){
       
    }
}
class depan extends induk{
    void posisi(){
        System.out.println("depan/belakang.");
    }
}
class tengah extends induk{
    void posisi(){
        System.out.println("tengah");
    }
}

      
public class Input extends Kelas {
      Scanner input;
      induk d = new depan();
              induk t=new tengah();
    
      public void Inputa(){
  
            input= new Scanner (System.in);
     
       System.out.print("Masukkan Nama Ruang:");
         setNamaRuang(input.nextInt());
       System.out.print("Lokasi Ruang Berada di GKB :");
        setLokasiRuang(input.nextInt());
       System.out.print("Input Fakultas :");
        setFakultas(input.next());
    
               }

      
    public void Inputb(){
         input = new Scanner (System.in);
       
   System.out.print("Pilih Panjang Ruang :1.0-2m 2.2-3m 3.>3m  ");
    setPanjangRuang(input.nextInt());
   System.out.print("Pilih Lebar Ruang:1.0-1m 2.1-2m 3.>2m  ");
    setLebarRuang(input.nextInt()); 
   System.out.print("Pilih Jumlah Kursi:1.0-10 2.10-25 3.>25  ");
    setJumlahKursi(input.nextInt());
   System.out.print("Pilih Jumlah Pintu : 1.0 2.1 ");
    setJumlahPintu(input.nextInt());
   System.out.print("Pilih Jumlah Jendela : 1.0-1 2.2-3 3.>3 ");
    setJumlahJendela(input.nextInt()); 
    }
       
  
    public void Inputc(){
         input= new Scanner (System.in);
             System.out.println("pilih Jumlah Stop Kontak/Steker : 1.0 2.1-2 3.>2");
              setJumlahSteker(input.nextInt())  ;
             System.out.println("Pilih Kondisi Stop Kontak/Steker : 1.buruk 2.Bagus");
              setKondisiSteker(input.nextInt());
             System.out.println("pilih Posisi Steker :1.tidak ada yang dekat meja dosen 2.Ada yang Dekat Meja Dosen");
               setPosisiSteker(input.nextInt());
             System.out.println("Pilih Jumlah Kabel LCD: 1.0 2.>=1 ");
              setJumlahLCD(input.nextInt())  ;
             System.out.println("Pilih Kondisi Kabel LCD : 1.buruk 2.Bagus");
              setKondisiLCD(input.nextInt());
             System.out.println("pilih Posisi LCD :1.tidak ada yang dekat meja dosen 2.Ada yang Dekat Meja Dosen");
               setPosisiLCD(input.nextInt());
               System.out.println("pilih Jumlah Lampu : 1.0 2.1-2 3.>2");
              setJumlahLampu(input.nextInt())  ;
             System.out.println("Pilih Kondisi Lampu : 1.buruk 2.Bagus");
              setKondisiLampu(input.nextInt());
             System.out.print("pilih Posisi Lampu :1.pinggir");
             System.out.print("2");t.posisi();
             
               setPosisiLampu(input.nextInt());
              System.out.println("pilih Jumlah Kipas Angin : 1.0 2.1-2 3.>2");
              setJumlahKipasAngin(input.nextInt())  ;
             System.out.println("Pilih Kondisi Kipas Angin : 1.buruk 2.Bagus");
              setKondisiKipasAngin(input.nextInt());
             System.out.println("pilih Posisi Kipas Angin :1.pinggir 2.");t.posisi();
               setPosisiKipasAngin(input.nextInt());
               System.out.println("pilih Jumlah AC : 1.0 2.1 3.>1");
              setJumlahAC(input.nextInt())  ;
             System.out.println("Pilih Kondisi AC : 1.buruk 2.Bagus");
              setKondisiAC(input.nextInt());
             System.out.println("pilih Posisi AC :1.Belakang 2.Samping");
               setPosisiAC(input.nextInt());
              System.out.println("Input nama SSID");
               setSSID(input.next());
             System.out.println("Input kecepatan Bandwidth :1.<1mb 2 1-5 Mb 3.>5Mb");
              setBandwidth(input.nextInt());
             System.out.println("pilih Jumlah CCTV : 1.tidak ada 2.1 cctv 3.2 cctv");
              setJumlahCCTV(input.nextInt())  ;
             System.out.println("Pilih Kondisi CCTV : 1.buruk 2.Bagus");
              setKondisiCCTV(input.nextInt());
              
             System.out.print("pilih posisi: 1. ");t.posisi();
             System.out.println("");
             System.out.print("            : 2. ");d.posisi();
               setPosisiCCTV(input.nextInt());
}
 

    public void Inputd(){
          input= new Scanner (System.in);
             System.out.println("pilih Kondisi Lantai : 1.Rusak 2.Sedang 3.Baik");
              setKondisiLantai(input.nextInt())  ;
             System.out.println("pilih Kondisi Dinding : 1.Rusak 2.Sedang 3.Baik");
              setKondisiDinding(input.nextInt())  ;
             System.out.println("pilih Kondisi Atap : 1.Rusak 2.Sedang 3.Baik");
              setKondisiAtap(input.nextInt())  ;
             System.out.println("pilih Kondisi Pintu : 1.Rusak 2.Sedang 3.Baik");
              setKondisiPintu(input.nextInt())  ;
             System.out.println("pilih Kondisi Jendela : 1.Rusak 2.Sedang 3.Baik");
    }
    


    public void Inpute(){
         input= new Scanner (System.in);
             System.out.println("pilih Sirkulasi Udara: 1.tersendat 2.Sedang 3.lancar");
              setSirkulasiUdara(input.nextInt())  ;
              System.out.println("pilih Nilai Pencahayaan: 1.gelap 2.remang 3.terang");
              setNilaiPencahayaan(input.nextInt())  ;
              System.out.println("pilih Kelembapan(%) : 1.Rusak 2.Sedang 3.Baik");
              setKelembapan(input.nextInt())  ;
              System.out.println("pilih Suhu(celcius) : 1.1-19 C 2.>27 C 3.20-27 C");
              setSuhu(input.nextInt())  ;
    }
 
 
    public void Inputf(){
        input= new Scanner (System.in);
             System.out.println("pilih Kebisingan: 1.Rusak 2.Sedang 3.Baik");
              setKebisingan(input.nextInt())  ;
              System.out.println("pilih Tingkat Kebauan: 1.Rusak 2.Sedang 3.Baik");
              setBau(input.nextInt())  ;
              System.out.println("pilih Kebocoran : 1.Rusak 2.Sedang 3.Baik");
              setKebocoran(input.nextInt())  ;
              System.out.println("pilih Kerusakan : 1.Rusak 2.Sedang 3.Baik");
              setKerusakan(input.nextInt())  ;
          System.out.println("pilih Keausan : 1.Rusak 2.Sedang 3.Baik");
              setKeausan(input.nextInt())  ;
    }
    
  
    public void Inputg(){
         input= new Scanner (System.in);
             System.out.println("pilih Kekokohan: 1.lapuk 2.Sedang 3.Baik");
              setKekokohan(input.nextInt())  ;
              System.out.println("pilih Kunci Pintu dan Jendela: 1.Rusak 2.Baik");
              setKuncipintudanjendela(input.nextInt())  ;
              System.out.println("pilih Tingkat Bahaya : 1.Berbahaya 2.Waspada 3.Aman");
              setBahaya(input.nextInt())  ;
    
}
}
