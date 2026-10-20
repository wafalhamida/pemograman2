/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuuan3;

/** 
 *
 * @author wafan
 */
import java.util.Scanner;

public class Atm {

    // Prosedur untuk login dan menjalankan menu ATM
    public void jalankan(Nasabah nasabah) {
        Scanner input = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("   SELAMAT DATANG DI ATM BBCA     ");
        System.out.println("==================================");
        
        // 1. Validasi Login (Nomor Rekening & PIN)
        System.out.print("Masukkan Nomor Rekening : ");
        String inputRek = input.nextLine();
        
        System.out.print("Masukkan PIN / Password : ");
        String inputPin = input.nextLine();

        // 2. Mengecek kecocokan data login
        if (inputRek.equals(nasabah.rek.nomorRekening) && inputPin.equals(nasabah.rek.pin)) {
            
            int pilihan;
            do {
                nasabah.tampilkanInfo();
                System.out.println("\n--- MENU UTAMA ATM ---");
                System.out.println("1. Cek Saldo");
                System.out.println("2. Setor Tunai");
                System.out.println("3. Tarik Tunai");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu (1-4): ");
                pilihan = input.nextInt();

                switch (pilihan) {
                    case 1:
                        nasabah.rek.cekSaldo();
                        break;
                    case 2:
                        System.out.print("Masukkan jumlah setor (Rp): ");
                        double setor = input.nextDouble();
                        nasabah.rek.setorTunai(setor);
                        break;
                    case 3:
                        System.out.print("Masukkan jumlah tarik (Rp): ");
                        double tarik = input.nextDouble();
                        nasabah.rek.tarikTunai(tarik);
                        break;
                    case 4:
                        System.out.println("Terima kasih telah menggunakan ATM. Silakan ambil kartu Anda.");
                        break;
                    default:
                        System.out.println("\nPilihan tidak valid! Masukkan angka 1 sampai 4.");
                }

                // Jeda agar user sempat membaca hasil transaksi sebelum kembali ke menu
                if (pilihan != 4) {
                    System.out.print("\nTekan ENTER untuk kembali ke menu...");
                    input.nextLine(); // Membersihkan sisa *enter*
                    input.nextLine(); // Menunggu user menekan Enter
                }

            } while (pilihan != 4);

        } else {
            System.out.println("\n[GAGAL] Nomor Rekening atau PIN salah! Akses ditolak.");
        }
        
        input.close();
    }
}