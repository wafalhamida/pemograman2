/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuuan3;

/**
 *
 * @author wafan
 */
public class rekening {
    String nomorRekening;
    String pin;
    double saldo;

    // Konstruktor untuk inisialisasi rekening
    public rekening(String noRek, String pinRahasia, double saldoAwal) {
        nomorRekening = noRek;
        pin = pinRahasia;
        saldo = saldoAwal;
    }

    // Prosedur Cek Saldo
    void cekSaldo() {
        System.out.println("\n--- CEK SALDO ---");
        System.out.println("No Rekening : " + nomorRekening);
        System.out.println("Sisa Saldo  : Rp " + saldo);
    }

    // Prosedur Setor Tunai (Validasi minimal 50rb & kelipatan pecahan 50rb/100rb)
    public void setorTunai(double jumlah) {
        if (jumlah >= 50000 && jumlah % 50000 == 0) {
            saldo += jumlah;
            System.out.println("\n[SUKSES] Berhasil setor tunai sebesar: Rp " + jumlah);
            System.out.println("Saldo sekarang: Rp " + saldo);
        } else {
            System.out.println("\n[GAGAL SETOR TUNAI]");
            System.out.println("- Minimal setor adalah Rp 50.000.");
            System.out.println("- Hanya menerima pecahan uang Rp 50.000 dan Rp 100.000.");
        }
    }

    // Prosedur Tarik Tunai
    public void tarikTunai(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("\n[SUKSES] Tarik tunai: Rp " + jumlah);
            System.out.println("Sisa saldo    : Rp " + saldo);
        } else {
            System.out.println("\n[GAGAL] Saldo tidak cukup atau jumlah tidak valid!");
        }
    }
}