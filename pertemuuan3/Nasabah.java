/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuuan3;

/**
 *
 * @author wafan
 */
public class Nasabah {
    String nama;
    rekening rek; // Relasi PBO: Objek Nasabah "memiliki" objek rekening

    // Konstruktor Nasabah
    public Nasabah(String namaNasabah, rekening rekeningNasabah) {
        nama = namaNasabah;
        rek = rekeningNasabah;
    }

    // Prosedur menampilkan info sapaan
    public void tampilkanInfo() {
        System.out.println("================================");
        System.out.println("   SELAMAT DATANG, " + nama.toUpperCase() + "   ");
        System.out.println("================================");
    }
}
