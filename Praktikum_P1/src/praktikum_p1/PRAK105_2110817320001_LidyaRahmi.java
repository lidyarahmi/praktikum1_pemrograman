/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum_p1;

import java.util.Scanner;

/**
 *
 * @author LIDYA RAHMI
 */
public class PRAK105_2110817320001_LidyaRahmi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputUser = new Scanner(System.in);
         final double phi = 3.14;
         // jari-jari (r), tinggi(t)//
        double jari_jari, tinggi, volume;
        
        System.out.print("Masukkan Jari-jari: ");
        jari_jari = inputUser.nextDouble();
        
        System.out.print("Masukkan Tinggi: ");
        tinggi = inputUser.nextDouble();
        
        // rumus menghitung untuk hasil volume//
         volume = (phi* jari_jari * jari_jari)  * tinggi;
        
        System.out.println("Volume tabung dengan jari-jari " + jari_jari + " cm dan tinggi " + tinggi + " cm adalah " + volume + " m3 ");
               
     }
    
}
