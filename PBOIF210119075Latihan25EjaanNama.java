/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119075.latihan25.ejaannama;
/**
 * @author  
 * Nama  : Aditiya Musthafa Kamil
 * Kelas : PBOIF2
 * NIM   : 10119075
 * Deskripsi Program : Program ini berisi program yang menampilkan ejaan suku kata
 **/

import java.util.Scanner;
public class PBOIF210119075Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama;
        
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        nama = input.next();
        
        System.out.println("Ejaan untuk "  + nama +   " adalah");
        String kata[] = nama.split("|");
        for (int i=0;i<kata.length;i++){
            System.out.println("Huruf Ke-" + (i+1) + ":" + kata[i]);
            
       System.out.println("===============================================");
       System.out.println("Developed by Aditiya Musthafa Kamil");
            
        }
        
    }
    
}
