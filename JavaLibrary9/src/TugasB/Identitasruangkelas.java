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
public abstract class Identitasruangkelas extends kelasabstrak{
    Scanner input;
    Kelas a = new Kelas();
    
    public void Input(){
  
       input = new Scanner (System.in);
     
       System.out.print("Masukkan Nama Ruang:");
       a.setNamaRuang(input.nextInt());
       System.out.print("Lokasi Ruang Berada di GKB :");
       a.setLokasiRuang(input.nextInt());
       System.out.print("Input Fakultas :");
       a.setFakultas(input.next());
    
       }
    int Analisis(){
        System.out.println("Nama Ruang :" + a.getNamaRuang());
        System.out.println("Lokasi Ruang berada di GKB: " + a.getLokasiRuang());
        System.out.println("Ruang berada di Fakultas: " + a.getFakultas());
        
        return 1;
    }
    
    
    void Output(){
        System.out.println("Kondisi kelas: " + Analisis());
        
    }
}
