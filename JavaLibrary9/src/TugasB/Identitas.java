
package TugasB;
import java.util.Scanner;


public class Identitas extends kelasabstrak {
  Scanner Input;
  Kelas l = new Kelas();
  @Override
    void Input(){
        
    
     Input= new Scanner (System.in);
     
       System.out.print("Masukkan Nomor Ruang:");
         l.setNamaRuang(Input.nextInt());
       System.out.print("Lokasi Ruang Berada di GKB :");
        l.setLokasiRuang(Input.nextInt());
       System.out.print("Input Fakultas :");
        l.setFakultas(Input.next());

    }
  @Override
    void Output(){
         System.out.println("Nomor Ruang :" + l.getNamaRuang());
             System.out.println("Lokasi Ruang berada di GKB: " + l.getLokasiRuang());
             System.out.println("Ruang berada di Fakultas: " + l.getFakultas());
    }
  @Override
    int Analisis(){
       return 1; 
    }
}