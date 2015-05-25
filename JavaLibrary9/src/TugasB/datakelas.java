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
               a.setHasilKeamanan( a.getKekokohan()+ a.getKuncipintudanjendela()+ a.getBahaya());
             if( a.getHasilKeamanan()>6){
                 System.out.println("Keamanan kelas yang baik");
            
           }
             else{
                 System.out.println("Keamanan kelas yang buruk");
             }
             
             
         }
         public void HasilIdentitass(){
     
             System.out.println("Nama Ruang :" + a.getNamaRuang());
             System.out.println("Lokasi Ruang berada di GKB: " + a.getLokasiRuang());
             System.out.println("Ruang berada di Fakultas: " + a.getFakultas());
          
         }
         public int HasilKondisii(){
              a.setHasilKondisi(  a.getJumlahJendela()+ a.getPanjangRuang()+ a.getLebarRuang()+ a.getJumlahKursi()+ a.getJumlahPintu());
   if( a.getHasilKondisi() >8){
       System.out.print("Kondisi kelas yang Baik");
       return 1;
   }
   else{
       System.out.print("Kondisi kelas yang Buruk");
   }
 return 0;
             
         
         }
         public void HasilJumlah(){
              a.setHasilJumlahKondisi( a.getJumlahSteker()+ a.getKondisiSteker()+ a.getPosisiSteker()+ a.getJumlahLCD()
            + a.getKondisiLCD()+ a.getJumlahLampu()+ a.getKondisiLampu()+ a.getKondisiKipasAngin()+ a.getJumlahKipasAngin()
            + a.getJumlahAC()+ a.getKondisiAC()+ a.getBandWith()+ a.getJumlahCCTV()+ a.getKondisiCCTV());
            if( a.getHasilJumlahKondisi()>27){
                System.out.println("Jumlah,Kondisi,dan posisi sarana dan prasarana Kelas yang Baik");
            }  
            else{
                System.out.println("Jumlah,Kondisi,dan posisi sarana dan prasarana Kelas yang Buruk");
            }
             
         }
         public void HasilLingkungann(){
                a.setHasilLingkungan( a.getKondisiLantai()+ a.getKondisiDinding()+ a.getKondisiAtap()+ a.getKondisiPintu()+ a.getKondisiJendela());
             if( a.getHasilLingkungan()>9){
                 System.out.println("Lingkungan kelas yang Baik");
             }
             else{
                 System.out.println("Lingkungan kelas yang buruk");
             }
             
         }
         public void HasilKebersihann(){
                a.setHasilKebersihan( a.getSirkulasiUdara()+ a.getNilaiPencahayaan()+ a.getKelembapan()+ a.getSuhu());
             if( a.getHasilKebersihan()>9){
                 System.out.println("Kebersihan kelas yang Baik");
                 
             }
             else{
                 System.out.println("Kebersihan kelas yang Buruk");
             }
         }
         public void HasilKenyamanann(){
               a.setHasilKenyamanan( a.getKebisingan()+ a.getBau()+ a.getKebocoran()+ a.getKerusakan() +  a.getKeausan());
         if( a.getHasilKenyamanan()>9){
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
