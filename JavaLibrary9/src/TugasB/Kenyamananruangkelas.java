/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasB;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author eL
 */
public class Kenyamananruangkelas {
    Scanner input;
    Kelas a = new Kelas();
    
    void Input(){
        input= new Scanner (System.in);
        System.out.println("pilih Kebisingan: 1.Rusak 2.Sedang 3.Baik");
        a.setKebisingan(input.nextInt())  ;
        System.out.println("pilih Tingkat Kebauan: 1.Rusak 2.Sedang 3.Baik");
        a.setBau(input.nextInt())  ;
        System.out.println("pilih Kebocoran : 1.Rusak 2.Sedang 3.Baik");
        a.setKebocoran(input.nextInt())  ;
        System.out.println("pilih Kerusakan : 1.Rusak 2.Sedang 3.Baik");
        a.setKerusakan(input.nextInt())  ;
        System.out.println("pilih Keausan : 1.Rusak 2.Sedang 3.Baik");
        a.setKeausan(input.nextInt())  ;
    }
    int Analisis(){
        a.setHasilKenyamanan( a.getKebisingan()+ a.getBau()+ a.getKebocoran()+ a.getKerusakan() +  a.getKeausan());
        if( a.getHasilKenyamanan()>9){
        System.out.println("Kenyamanan kelas yang Baik");
        }
        else{
        System.out.println("Kenyamanankelas yang Buruk");
        }
        return 1;
    }
  
    public void Output(){
        Input();
        System.out.println("Memiliki : ");
        Analisis();
        
    }
    
    public void Save(){
        try{
           FileWriter Writer = new FileWriter("Kenyamanan.txt");
           Writer.write("Kebisingan Ruangan = " +a.getKebisingan()+"\t");
           Writer.write("Bau Ruangan = " + a.getBau()+"\t");
           Writer.write("Kebocoran Ruangan= " + a.getKebocoran()+"\t");
           Writer.write("Kerusakan Ruangan= " + a.getKerusakan()+"\t");
           Writer.write("Keausan Ruangan= " + a.getKeausan()+"\t");
           Writer.close();
         }catch(IOException ex){
             ex.printStackTrace();
         }
    }
}
