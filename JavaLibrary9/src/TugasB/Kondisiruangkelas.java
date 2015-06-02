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
public abstract class Kondisiruangkelas extends kelasabstrak{
    Scanner input;
    Kelas a = new Kelas();
    
    public void Input(){
        input = new Scanner (System.in);
       
    System.out.println("Pilih Panjang Ruang :1.0-2m 2.2-3m 3.>3m  ");
    a.setPanjangRuang(input.nextInt());
    System.out.println("Pilih Lebar Ruang:1.0-1m 2.1-2m 3.>2m  ");
    a.setLebarRuang(input.nextInt()); 
    System.out.println("Pilih Jumlah Kursi:1.0-10 2.10-25 3.>25  ");
    a.setJumlahKursi(input.nextInt());
    System.out.println("Pilih Jumlah Pintu : 1.0 2.1 ");
    a.setJumlahPintu(input.nextInt());
    System.out.println("Pilih Jumlah Jendela : 1.0-1 2.2-3 3.>3 ");
    a.setJumlahJendela(input.nextInt()); 
    }
    int Analisis(){
        a.setHasilKondisi(  a.getJumlahJendela()+ a.getPanjangRuang()+ a.getLebarRuang()+ a.getJumlahKursi()+ a.getJumlahPintu());
        if( a.getHasilKondisi() >8){
        System.out.println("Kondisi kelas yang Baik");
        return 1;
    }else{
        System.out.println("Kondisi kelas yang Buruk");
    }
        return 0;
    }
    void Output(){
        System.out.println("Kondisi kelas: "+ Analisis());
    }
    void Save(){
        try{
            FileWriter a = new FileWriter("Ruangkelas.txt");
            a.write("Kondisi kelas: " + Analisis());
        }catch(Exception a){
            a.printStackTrace();
        }
    }
}
