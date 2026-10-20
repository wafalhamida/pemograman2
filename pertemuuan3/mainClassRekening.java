/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuuan3;

/**
 *1
 * @author wafan
 */
public class mainClassRekening {
    public static void main(String[] args) {
        
        // 1. Membuat objek Rekening (No Rekening, PIN Rahasia, Saldo Awal)
        rekening dompetKu = new rekening("998877", "1234", 1500000);

        // 2. Membuat objek Nasabah dan menyematkan rekening ke dalamnya (Nama, Objek Rekening)
        Nasabah orangnya = new Nasabah("NAZILAl", dompetKu);

        // 3. Membuat objek Mesin ATM
        Atm mesinAtm = new Atm();

        // 4. Menjalankan mesin ATM
        mesinAtm.jalankan(orangnya);
    }
}