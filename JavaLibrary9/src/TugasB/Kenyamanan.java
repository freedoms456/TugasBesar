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
public class Kenyamanan extends kelasabstrak{
        Scanner input;
    Kelas l = new Kelas();
    @Override
    void Input(){
         input= new Scanner (System.in);
             System.out.println("pilih Kebisingan: 1.Rusak 2.Sedang 3.Baik");
              l.setKebisingan(input.nextInt())  ;
              System.out.println("pilih Tingkat Kebauan: 1.Rusak 2.Sedang 3.Baik");
              l.setBau(input.nextInt())  ;
              System.out.println("pilih Kebocoran : 1.Rusak 2.Sedang 3.Baik");
              l.setKebocoran(input.nextInt())  ;
              System.out.println("pilih Kerusakan : 1.Rusak 2.Sedang 3.Baik");
              l.setKerusakan(input.nextInt())  ;
          System.out.println("pilih Keausan : 1.Rusak 2.Sedang 3.Baik");
              l.setKeausan(input.nextInt())  ;
    }
    
    @Override
    int Analisis(){
         l.setHasilKenyamanan( l.getKebisingan()+ l.getBau()+ l.getKebocoran()+ l.getKerusakan() +  l.getKeausan());
         if( l.getHasilKenyamanan()>9){
             System.out.println("Kenyamanan kelas yang Baik");
         }
         else{
             System.out.println("Kenyamanankelas yang Buruk");
         }
         return 1;
    }
    
    @Override
    void Output(){
     
            System.out.print("Kenyamanan kelas = ");  
        Analisis();
    }
    
}
