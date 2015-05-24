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
               setHasilKeamanan( getKekokohan()+ getKuncipintudanjendela()+ getBahaya());
             if( getHasilKeamanan()>6){
                 System.out.println("Keamanan kelas yang baik");
            
           }
             else{
                 System.out.println("Keamanan kelas yang buruk");
             }
             
             
         }
         public void HasilIdentitass(){
     
             System.out.println("Nama Ruang :" + getNamaRuang());
             System.out.println("Lokasi Ruang berada di GKB: " + getLokasiRuang());
             System.out.println("Ruang berada di Fakultas: " + getFakultas());
          
         }
         public int HasilKondisii(){
              setHasilKondisi(  getJumlahJendela()+ getPanjangRuang()+ getLebarRuang()+ getJumlahKursi()+ getJumlahPintu());
   if( getHasilKondisi() >8){
       System.out.print("Kondisi kelas yang Baik");
       return 1;
   }
   else{
       System.out.print("Kondisi kelas yang Buruk");
   }
 return 0;
             
         
         }
         public void HasilJumlah(){
              setHasilJumlahKondisi( getJumlahSteker()+ getKondisiSteker()+ getPosisiSteker()+ getJumlahLCD()
            + getKondisiLCD()+ getJumlahLampu()+ getKondisiLampu()+ getKondisiKipasAngin()+ getJumlahKipasAngin()
            + getJumlahAC()+ getKondisiAC()+ getBandWith()+ getJumlahCCTV()+ getKondisiCCTV());
            if( getHasilJumlahKondisi()>27){
                System.out.println("Jumlah,Kondisi,dan posisi sarana dan prasarana Kelas yang Baik");
            }  
            else{
                System.out.println("Jumlah,Kondisi,dan posisi sarana dan prasarana Kelas yang Buruk");
            }
             
         }
         public void HasilLingkungann(){
                setHasilLingkungan( getKondisiLantai()+ getKondisiDinding()+ getKondisiAtap()+ getKondisiPintu()+ getKondisiJendela());
             if( getHasilLingkungan()>9){
                 System.out.println("Lingkungan kelas yang Baik");
             }
             else{
                 System.out.println("Lingkungan kelas yang buruk");
             }
             
         }
         public void HasilKebersihann(){
                setHasilKebersihan( getSirkulasiUdara()+ getNilaiPencahayaan()+ getKelembapan()+ getSuhu());
             if( getHasilKebersihan()>9){
                 System.out.println("Kebersihan kelas yang Baik");
                 
             }
             else{
                 System.out.println("Kebersihan kelas yang Buruk");
             }
         }
         public void HasilKenyamanann(){
               setHasilKenyamanan( getKebisingan()+ getBau()+ getKebocoran()+ getKerusakan() +  getKeausan());
         if( getHasilKenyamanan()>9){
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
