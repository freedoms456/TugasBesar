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
public abstract class Jumlahkondisidanposisisarana extends kelasabstrak{
    Scanner input;
    
    Kelas a = new Kelas();
 
    
    public void input(){
        input= new Scanner (System.in);
        System.out.println("pilih Jumlah Stop Kontak/Steker : 1.0 2.1-2 3.>2");
        a.setJumlahSteker(input.nextInt())  ;
        System.out.println("Pilih Kondisi Stop Kontak/Steker : 1.buruk 2.Bagus");
        a.setKondisiSteker(input.nextInt());
        System.out.println("pilih Posisi Steker :1.tidak ada yang dekat meja dosen 2.Ada yang Dekat Meja Dosen");
        a.setPosisiSteker(input.nextInt());
        System.out.println("Pilih Jumlah Kabel LCD: 1.0 2.>=1 ");
        a.setJumlahLCD(input.nextInt())  ;
        System.out.println("Pilih Kondisi Kabel LCD : 1.buruk 2.Bagus");
        a.setKondisiLCD(input.nextInt());
        System.out.println("pilih Posisi LCD :1.tidak ada yang dekat meja dosen 2.Ada yang Dekat Meja Dosen");
        a.setPosisiLCD(input.nextInt());
        System.out.println("pilih Jumlah Lampu : 1.0 2.1-2 3.>2");
        a.setJumlahLampu(input.nextInt())  ;
        System.out.println("Pilih Kondisi Lampu : 1.buruk 2.Bagus");
        a.setKondisiLampu(input.nextInt());
        System.out.print("pilih Posisi Lampu :1.pinggir 2.tengah");
    
             
        a.setPosisiLampu(input.nextInt());
        System.out.println("pilih Jumlah Kipas Angin : 1.0 2.1-2 3.>2");
        a.setJumlahKipasAngin(input.nextInt())  ;
        System.out.println("Pilih Kondisi Kipas Angin : 1.buruk 2.Bagus");
        a.setKondisiKipasAngin(input.nextInt());
        System.out.println("pilih Posisi Kipas Angin :1.pinggir 2.tengah");
        a.setPosisiKipasAngin(input.nextInt());
        System.out.println("pilih Jumlah AC : 1.0 2.1 3.>1");
        a.setJumlahAC(input.nextInt())  ;
        System.out.println("Pilih Kondisi AC : 1.buruk 2.Bagus");
        a.setKondisiAC(input.nextInt());
        System.out.println("pilih Posisi AC :1.Belakang 2.Samping");
        a.setPosisiAC(input.nextInt());
        System.out.println("Input nama SSID");
        a.setSSID(input.next());
        System.out.println("Input kecepatan Bandwidth :1.<1mb 2 1-5 Mb 3.>5Mb");
        a.setBandwidth(input.nextInt());
        System.out.println("pilih Jumlah CCTV : 1.tidak ada 2.1 cctv 3.2 cctv");
        a.setJumlahCCTV(input.nextInt())  ;
        System.out.println("Pilih Kondisi CCTV : 1.buruk 2.Bagus");
        a.setKondisiCCTV(input.nextInt());
              
        System.out.print("pilih posisi: 1.tengah 2.depan");
      
        a.setPosisiCCTV(input.nextInt());
    }
    int Analisis(){
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
    void Output(){
        System.out.println("Kondisi kelas: "+ Analisis());
    }
    void Save(){
        try{
            FileWriter a = new FileWriter(".txt");
            a.write("Kondisi kelas: " + Analisis());
        }catch(Exception a){
            a.printStackTrace();
        }
    }
}
