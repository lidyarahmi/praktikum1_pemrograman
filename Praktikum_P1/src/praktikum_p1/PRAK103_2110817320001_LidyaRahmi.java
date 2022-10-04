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
public class PRAK103_2110817320001_LidyaRahmi{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int input = 5, angka;   
    Scanner inputUser = new Scanner(System.in);
 
        System.out.print("Masukkan input: ");
         angka = inputUser.nextInt();  //Memasukkan inputan angka
                 
        do{
                if (angka % 7 != 0){  
               System.out.print(angka+" ,");
                }
        
         input--;
         angka--;
         }  while (input > 0);
    }        
}





