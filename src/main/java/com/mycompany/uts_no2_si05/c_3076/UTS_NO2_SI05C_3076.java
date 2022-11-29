/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no2_si05.c_3076;

/**
 *
 * @author user
 */
public class UTS_NO2_SI05C_3076 {

    public static void main(String[] args) {

        Commision_3076 c1 = new Commision_3076 (200000,30000,5,"Feisya","1A2B3C4D");
        Project_3076 p1 = new Project_3076 (300000,20000,6,"Kartika","1A2B3C4D");
        Salaried_3076 s1 = new Salaried_3076(100000,"Ilmi","1A2B3C4D");
        
        System.out.println("DATA COMMISION EMPLOYEE");
        c1.tampilData();
        c1.hitungGaji();
        
        System.out.println();
        
        System.out.println("DATA PROJECT PLANNER");
        p1.tampilData();
        p1.hitungGaji();
        
        System.out.println();
        
        System.out.println("DATA SALARIED EMPLOYEE");
        s1.tampilData();
        s1.hitungGaji();
        
    }

}

