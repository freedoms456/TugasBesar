package TugasB;

import java.util.Scanner;
import TugasB.Kelas;


public class datakelas extends Input{
    Scanner input;

 
    
   public void Identitasruangkelas(){ 
       Inputa();
      
    }
    
  public void Kondisiruangkelas(){
      Inputb();
   
   }
 
         public void Jumlahkondisidanposisisarana(){
              
            Inputc(); 
         }
             public void Lingkunganruangkelas(){
            Inputd();      
         
         }
         public void Kebersihanruangkelas(){
            Inpute();             
        
         }
         public void Kenyamananruangkelas(){
         Inputf();
           }
         public void Keamananruangkelas(){
     Inputg();
}
         
         
         
         public void HasilKeamanann(){
               l.setHasilKeamanan( l.getKekokohan()+ l.getKuncipintudanjendela()+ l.getBahaya());
             if( l.getHasilKeamanan()>6){
                 System.out.println("Keamanan kelas yang baik");
            
           }
             else{
                 System.out.println("Keamanan kelas yang buruk");
             }
             
             
         }
         public void HasilIdentitass(){
     
             System.out.println("Nama Ruang :" + l.getNamaRuang());
             System.out.println("Lokasi Ruang berada di GKB: " + l.getLokasiRuang());
             System.out.println("Ruang berada di Fakultas: " + l.getFakultas());
          
         }
         public int HasilKondisii(){
              l.setHasilKondisi(  l.getJumlahJendela()+ l.getPanjangRuang()+ l.getLebarRuang()+ l.getJumlahKursi()+ l.getJumlahPintu());
   if( l.getHasilKondisi() >8){
       System.out.print("Kondisi kelas yang Baik");
       return 1;
   }
   else{
       System.out.print("Kondisi kelas yang Buruk");
   }
 return 0;
             
         
         }
         public void HasilJumlah(){
              l.setHasilJumlahKondisi( l.getJumlahSteker()+ l.getKondisiSteker()+ l.getPosisiSteker()+ l.getJumlahLCD()
            + l.getKondisiLCD()+ l.getJumlahLampu()+ l.getKondisiLampu()+ l.getKondisiKipasAngin()+ l.getJumlahKipasAngin()
            + l.getJumlahAC()+ l.getKondisiAC()+ l.getBandWith()+ l.getJumlahCCTV()+ l.getKondisiCCTV());
            if( l.getHasilJumlahKondisi()>27){
                System.out.println("Jumlah,Kondisi,dan posisi sarana dan prasarana Kelas yang Baik");
            }  
            else{
                System.out.println("Jumlah,Kondisi,dan posisi sarana dan prasarana Kelas yang Buruk");
            }
             
         }
         public void HasilLingkungann(){
                l.setHasilLingkungan( l.getKondisiLantai()+ l.getKondisiDinding()+ l.getKondisiAtap()+ l.getKondisiPintu()+ l.getKondisiJendela());
             if( l.getHasilLingkungan()>9){
                 System.out.println("Lingkungan kelas yang Baik");
             }
             else{
                 System.out.println("Lingkungan kelas yang buruk");
             }
             
         }
         public void HasilKebersihann(){
                l.setHasilKebersihan( l.getSirkulasiUdara()+ l.getNilaiPencahayaan()+ l.getKelembapan()+ l.getSuhu());
             if( l.getHasilKebersihan()>9){
                 System.out.println("Kebersihan kelas yang Baik");
                 
             }
             else{
                 System.out.println("Kebersihan kelas yang Buruk");
             }
         }
         public void HasilKenyamanann(){
               l.setHasilKenyamanan( l.getKebisingan()+ l.getBau()+ l.getKebocoran()+ l.getKerusakan() +  l.getKeausan());
         if( l.getHasilKenyamanan()>9){
             System.out.println("Kenyamanan kelas yang Baik");
         }
         else{
             System.out.println("Kenyamanankelas yang Buruk");
         }
         }
   
         
         
         public void Input(){
             
             Identitasruangkelas();
             Kondisiruangkelas();
           Jumlahkondisidanposisisarana();
            Lingkunganruangkelas();
           Kebersihanruangkelas();
            Kenyamananruangkelas();
             Keamananruangkelas();
         }
         
         public void Output(){
             System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
             System.out.println("Dengan Data Dari inputan Users kami menilai bahwa  :");
              HasilIdentitass();
             System.out.println("Memiliki : ");
             System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
             HasilKondisii();
             HasilJumlah();
              HasilLingkungann();
              HasilKebersihann();
              HasilKenyamanann();
              HasilKeamanann();
         }
     
         
     
}
