/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasB;

import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author eL
 */
public abstract class Kebersihanruangkelas extends kelasabstrak{
    Scanner input;
    Kelas a = new Kelas();
    
    public void Input(){
        input= new Scanner (System.in);
        System.out.println("pilih Sirkulasi Udara: 1.tersendat 2.Sedang 3.lancar");
        a.setSirkulasiUdara(input.nextInt())  ;
        System.out.println("pilih Nilai Pencahayaan: 1.gelap 2.remang 3.terang");
        a.setNilaiPencahayaan(input.nextInt())  ;
        System.out.println("pilih Kelembapan(%) : 1.Rusak 2.Sedang 3.Baik");
        a.setKelembapan(input.nextInt())  ;
        System.out.println("pilih Suhu(celcius) : 1.1-19 C 2.>27 C 3.20-27 C");
        a.setSuhu(input.nextInt())  ;
}
    int Analisis(){
        a.setHasilKebersihan( a.getSirkulasiUdara()+ a.getNilaiPencahayaan()+ a.getKelembapan()+ a.getSuhu());
        if( a.getHasilKebersihan()>9){
        System.out.println("Kebersihan kelas yang Baik");
        }
        else{
            System.out.println("Kebersihan kelas yang Buruk");
        }
        return 1;
    }
    void Output(){
        System.out.println("Kondisi kelas: "+ Analisis());
    }
    void Save(){
        try{
            FileWriter a = new FileWriter("Kebersihan.txt");
            a.write("Kondisi kelas: " + Analisis());
        }catch(Exception a){
            a.printStackTrace();
        }
    }
}
