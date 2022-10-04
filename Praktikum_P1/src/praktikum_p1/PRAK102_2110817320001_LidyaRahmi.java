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
public class PRAK102_2110817320001_LidyaRahmi {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        int angka = 1 ;
        int bilangan; // variabel  untuk memasukkan inputan angka yang sesuai sama soal//
        Scanner userInput = new Scanner(System.in);
     
         System.out.print("Masukkan input :");
         bilangan = userInput.nextInt(); // tipe data  untuk memasukkan inputan angka yang sesuai sama soal//
         
         System.out.print("Hasil Output: "); 
         while (angka <= 7 ){  // untuk inputan 7 baris//
             if( bilangan  % 2 == 0) { // percabangan angka genap yang ada sisa bagi 2//
                               int nomer; // menambahkan variabel untuk pengoperasian sama variabel bilangan dimana dibagi 2 kurang 1 //
                               nomer = (bilangan / 2) - 1;
                               System.out.print("  " + nomer + " ");  // karena variabel nomer yang men deklarasikan di operasi ini//
             } else {
                  System.out.print(bilangan); // hasil dari inputan angka bilangan //
             }
                 
         bilangan++;
         angka++;
      
     }
    }
}
    
         
    
    

