/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasB;

import java.util.Scanner;

/**
 *
 * @author eL
 */
public abstract class Lingkunganruangkelas extends kelasabstrak{
    Scanner input;
    Kelas a = new Kelas();
    
    public void input(){
        
    input = new Scanner (System.in);
    System.out.println("pilih Kondisi Lantai : 1.Rusak 2.Sedang 3.Baik");
    a.setKondisiLantai(input.nextInt())  ;
    System.out.println("pilih Kondisi Dinding : 1.Rusak 2.Sedang 3.Baik");
    a.setKondisiDinding(input.nextInt())  ;
    System.out.println("pilih Kondisi Atap : 1.Rusak 2.Sedang 3.Baik");
    a.setKondisiAtap(input.nextInt())  ;
    System.out.println("pilih Kondisi Pintu : 1.Rusak 2.Sedang 3.Baik");
    a.setKondisiPintu(input.nextInt())  ;
    System.out.println("pilih Kondisi Jendela : 1.Rusak 2.Sedang 3.Baik");
    }
    int Analisis(){
        a.setHasilLingkungan( a.getKondisiLantai()+ a.getKondisiDinding()+ a.getKondisiAtap()+ a.getKondisiPintu()+ a.getKondisiJendela());
        if( a.getHasilLingkungan()>9){
            System.out.println("Lingkungan kelas yang Baik");
        }
        else{
            System.out.println("Lingkungan kelas yang buruk");
            }
        return 1;
    }
    void Output(){
        System.out.println("Kondisi kelas: "+ Analisis());
    }
}
