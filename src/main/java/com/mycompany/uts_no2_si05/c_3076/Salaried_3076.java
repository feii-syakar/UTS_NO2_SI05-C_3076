/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_si05.c_3076;

/**
 *
 * @author user
 */
public class Salaried_3076 extends Employee_3076{
    int upahMingguan;

    public Salaried_3076(int upahMingguan, String nama, String nip) {
        super(nama, nip);
        this.upahMingguan = upahMingguan;
    }
    public void tampilData() {
        System.out.println("Nama : " + nama);
        System.out.println("NIP : " + nip);
        System.out.println("Upah Mingguan : " + upahMingguan);
        
    }

    public void hitungGaji() {
        int hitungGaji = upahMingguan;
        System.out.println("Gaji : " + hitungGaji);
    }

}
