/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasB;

import java.util.Scanner;


public class Keamanan extends kelasabstrak{
            Scanner input;
    Kelas l = new Kelas();
    @Override
    void Input(){
          input= new Scanner (System.in);
             System.out.println("pilih Kekokohan: 1.lapuk 2.Sedang 3.Baik");
              l.setKekokohan(input.nextInt())  ;
              System.out.println("pilih Kunci Pintu dan Jendela: 1.Rusak 2.Baik");
              l.setKuncipintudanjendela(input.nextInt())  ;
              System.out.println("pilih Tingkat Bahaya : 1.Berbahaya 2.Waspada 3.Aman");
              l.setBahaya(input.nextInt())  ;
    }
    
    
    @Override
    int Analisis(){
        l.setHasilKeamanan( l.getKekokohan()+ l.getKuncipintudanjendela()+ l.getBahaya());
             if( l.getHasilKeamanan()>6){
                 System.out.println("Keamanan kelas yang baik");
            
           }
             else{
                 System.out.println("Keamanan kelas yang buruk");
             }
             
         return 1;
    }
    
    @Override
    void Output(){
     
            System.out.print("Keamanan kelas = ");  
        Analisis();
    }
    
}
