/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan34;

import java.util.Scanner;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : (Object Oriented) Kalkulator
 */

public class Latihan34 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Kalkulator kalkulator = new Kalkulator();
        
        System.out.println("=====Aplikasi Kalkulator Bilangan=====");
        System.out.print("Masukkan Angka ke-1 : ");
        kalkulator.value1= input.nextDouble();
        
        System.out.print("Masukkan Angka ke-2 : ");
        kalkulator.value2 = input.nextDouble();
        System.out.println("");
        
        System.out.println("Hasil Pertambahan : " + kalkulator.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + kalkulator.kurangBilangan());
        System.out.println("Hasil Perkalian   : " + kalkulator.kaliBilangan());
        System.out.println("Hasil Pembagian   : " + kalkulator.bagiBilangan());
        System.out.println("Hasil Sisa        : " + kalkulator.sisaBilangan());
    }
    
}
