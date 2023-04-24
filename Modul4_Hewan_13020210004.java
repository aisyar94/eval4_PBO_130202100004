/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul4_hewan_13020210004;

/**
 *
 * @author ACER
 */
public class Modul4_Hewan_13020210004 {

    public static void main(String[] args) {
        Hewan hewan1 = new Kucing();
        Hewan hewan2 = new Anjing();
        Hewan hewan3 = new Burung();

        hewan1.makan(); // output: Kucing makan ikan
        hewan2.makan(); // output: Anjing makan tulang
        hewan3.makan(); // output: Burung makan biji-bijian
    }

    }

