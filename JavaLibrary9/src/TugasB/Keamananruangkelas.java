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
public class Keamananruangkelas {
    Scanner input;
    Kelas a = new Kelas();
    
    void Input(){
        input= new Scanner (System.in);
        System.out.println("pilih Kekokohan: 1.lapuk 2.Sedang 3.Baik");
        a.setKekokohan(input.nextInt())  ;
        System.out.println("pilih Kunci Pintu dan Jendela: 1.Rusak 2.Baik");
        a.setKuncipintudanjendela(input.nextInt())  ;
        System.out.println("pilih Tingkat Bahaya : 1.Berbahaya 2.Waspada 3.Aman");
        a.setBahaya(input.nextInt())  ;
    }
    int Analisis(){
        a.setHasilKeamanan(a.getKekokohan()+a.getKuncipintudanjendela()+a.getBahaya());
        if( a.getHasilKeamanan()>6){
        System.out.println("Keamanan kelas yang baik");   
        }
        else{
        System.out.println("Keamanan kelas yang buruk");
        }   
        return 1;
    }
    
}
