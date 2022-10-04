/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak104_2110817320001_lidyarahmi;

import java.util.Scanner;

/**
 *
 * @author LIDYA RAHMI
 */
public class PRAK104_2110817320001_LidyaRahmi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int kartu_andi1, kartu_andi2, kartu_andi3; 
          int kartu_budi1, kartu_budi2, kartu_budi3; 
        Scanner inputUser = new Scanner(System.in);
              
        System.out.print("Kartu Andi : ");
        kartu_andi1 = inputUser.nextInt();
        kartu_andi2 = inputUser.nextInt();
        kartu_andi3 = inputUser.nextInt();
        
        System.out.print("Kartu Budi : ");
        kartu_budi1 = inputUser.nextInt();
        kartu_budi2 = inputUser.nextInt();
        kartu_budi3= inputUser.nextInt();
        
        int andi = 0;
        int budi = 0;
        
        System.out.print("Maka Hasilnya adalah : ");
        if(kartu_andi1 > kartu_budi1 ){
            andi = andi + 1;
        }else if(kartu_andi1 == kartu_budi1){
         
        } else {
            budi = budi + 1;
         }
        
        if(kartu_andi2 > kartu_budi2 ){
            andi = andi + 1;
        }else if(kartu_andi2 == kartu_budi2){
         
        } else {
            budi = budi + 1;
         }
        
        if(kartu_andi3 > kartu_budi3 ){
            andi = andi + 1;
        }else if(kartu_andi3 == kartu_budi3){
         
        } else {
            budi = budi + 1;
         }
        
        if (andi > budi){
            System.out.println("Andi");
        } else if (andi == budi){
            System.out.println("Seri");
        } else {
            System.out.println("Budi");
        }
    }
}
        
        
    
