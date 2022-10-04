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
public class PRAK101_2110817320001_LidyaRahmi {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, tempat_lahir, bulan_lahir=null;
        int bulan;

        System.out.print("Masukkan Nama Lengkap: "); // Memasukkan inputan nama lengkap //
        nama = input.nextLine();
        System.out.print("Masukkan Tempat Lahir: "); // Memasukkan inputan Tempat lahir //
        tempat_lahir = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir: "); // Memasukkan inputan tanggal lahir //
        int tanggal_lahir = input.nextInt();
        System.out.print("Masukkan Bulan Lahir: "); // Memasukkan inputan bulan lahir //
        bulan = input.nextInt();
        
        {if (bulan == 1) bulan_lahir = "Januari";
        else if(bulan == 2) bulan_lahir = "Februari";
        else if(bulan == 3) bulan_lahir = "Maret";
        else if(bulan == 4) bulan_lahir = "April";
        else if(bulan == 5) bulan_lahir = "Mei";
        else if(bulan == 6) bulan_lahir = "Juni";
        else if(bulan == 7) bulan_lahir = "Juli";
        else if(bulan == 8) bulan_lahir = "Agustus";
        else if(bulan == 9) bulan_lahir = "September";
        else if(bulan == 10) bulan_lahir = "Oktober";
        else if(bulan == 11) bulan_lahir = "November";
        else if(bulan == 12) bulan_lahir = "Desember"; 
        
        System.out.print("Masukkan Tahun Lahir: "); // Memasukkan inputan tahun lahir//
        int tahun_lahir = input.nextInt();
        System.out.print("Masukkan Tinggi Badan: "); // Memasukkan inputan tinggi badan //
        int tinggi_badan = input.nextInt();
        System.out.print("Masukkan Berat Badan: "); // Memasukkan inputan berat badan //
        float berat_badan = input.nextFloat();

//        Month month = Month.of(bulan_lahir); // Bulan dari int ke string, bisa menggunakan ini//

        System.out.println("\nData Telah Ditambahkan,\n"+"Nama Lengkap "+nama+", Lahir di "+tempat_lahir+" pada Tanggal "
        +tanggal_lahir+" "+bulan_lahir+" "+tahun_lahir+"\nTinggi Badan "+tinggi_badan+" cm dan Berat Badan "+berat_badan+" kilogram");
        // Hasil output secara keseluruhan berdasarkan variable //

            input.close();
    }
    }
}