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
public class Lingkungan extends kelasabstrak {
    Scanner input;
    Kelas l = new Kelas();
    void Input(){
        input= new Scanner (System.in);
             System.out.println("pilih Kondisi Lantai : 1.Rusak 2.Sedang 3.Baik");
              l.setKondisiLantai(input.nextInt())  ;
             System.out.println("pilih Kondisi Dinding : 1.Rusak 2.Sedang 3.Baik");
              l.setKondisiDinding(input.nextInt())  ;
             System.out.println("pilih Kondisi Atap : 1.Rusak 2.Sedang 3.Baik");
              l.setKondisiAtap(input.nextInt())  ;
             System.out.println("pilih Kondisi Pintu : 1.Rusak 2.Sedang 3.Baik");
              l.setKondisiPintu(input.nextInt())  ;
             System.out.println("pilih Kondisi Jendela : 1.Rusak 2.Sedang 3.Baik");
        
    }
    int Analisis(){
        l.setHasilLingkungan( l.getKondisiLantai()+ l.getKondisiDinding()+ l.getKondisiAtap()+ l.getKondisiPintu()+ l.getKondisiJendela());
             if( l.getHasilLingkungan()>9){
                 System.out.println("Lingkungan kelas yang Baik");
             }
             else{
                 System.out.println("Lingkungan kelas yang buruk");
             } 
             return 1;
    }
    
    void Output(){
       
            System.out.print("Lingkungan kelas = ");  
        Analisis();
    }
    
}
