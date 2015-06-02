/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasB;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Kebersihan extends kelasabstrak{

        Scanner input;
    Kelas l = new Kelas();
    @Override
    void Input(){
         input= new Scanner (System.in);
             System.out.println("pilih Sirkulasi Udara: 1.tersendat 2.Sedang 3.lancar");
              l.setSirkulasiUdara(input.nextInt())  ;
              System.out.println("pilih Nilai Pencahayaan: 1.gelap 2.remang 3.terang");
              l.setNilaiPencahayaan(input.nextInt())  ;
              System.out.println("pilih Kelembapan(%) : 1.Rusak 2.Sedang 3.Baik");
              l.setKelembapan(input.nextInt())  ;
              System.out.println("pilih Suhu(celcius) : 1.1-19 C 2.>27 C 3.20-27 C");
              l.setSuhu(input.nextInt())  ;
    }
    
    @Override
    int Analisis(){
        l.setHasilKebersihan( l.getSirkulasiUdara()+ l.getNilaiPencahayaan()+ l.getKelembapan()+ l.getSuhu());
             if( l.getHasilKebersihan()>9){
                 System.out.println("Kebersihan kelas yang Baik");
                 
             }
             else{
                 System.out.println("Kebersihan kelas yang Buruk");
                 
             }
             return 1;
    }
    
    @Override
    void Output(){
     
            System.out.print("Kebersihan kelas = ");  
        Analisis();
    }
}
