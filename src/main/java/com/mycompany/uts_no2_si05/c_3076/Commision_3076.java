/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_si05.c_3076;

/**
 *
 * @author user
 */
public class Commision_3076 extends Employee_3076 {
   int gajiPokok;
   int komisi;
   int totalPenjualan;

    public Commision_3076(int gajiPokok, int komisi, int totalPenjualan, String nama, String nip) {
        super(nama, nip);
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalPenjualan = totalPenjualan;
    }
    public void hitungGaji() {
        int hitungGaji = gajiPokok + (komisi * totalPenjualan);
        System.out.println("Gaji : " + hitungGaji);
    }
    public void tampilData() {
        System.out.println("Nama : " + nama);
        System.out.println("NIP : " + nip);
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Komisi : " + komisi);
        System.out.println("Total Hasil Penjualan : " + totalPenjualan);

    }

}
 