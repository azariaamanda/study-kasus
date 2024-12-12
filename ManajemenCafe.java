import java.util.Scanner;

public class ManajemenCafe {

    static String[] namaPelanggan = new String[100];
    static String[] namaMenu = {"Kopi Hitam", "Latte", "Teh Tarik", "Mie Goreng"};
    static int[] hargaMenu = {15000, 22000, 12000, 18000};
    static int [] nomorMeja = new int[100];
    static int[] jumlahItem = new int[100];
    static double[] totalHarga = new double[100];
    static int jumlahPesanan = 0;

    public static void main(String[] args) {
        Scanner sc5 = new Scanner(System.in);
        int pilihMenu=0;

        while (pilihMenu !=3) {
            System.out.println("======== MENU UTAMA ========");
            System.out.println("1. Tambahkan Pesanan");
            System.out.println("2. Tampilkan Daftar Pesanan");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihMenu = sc5.nextInt();
            sc5.nextLine();

            if (pilihMenu == 1) {
                tambahkanPesanan(sc5);
            } else if (pilihMenu == 2) {
                tampilkanDaftarPesanan();
            } else if ( pilihMenu == 3) {
                System.out.println("Terima kasih!");
            } else {
                System.out.println("Menu tidak valid!");
            }
        }
    }

    static void tambahkanPesanan(Scanner sc5) {
        System.out.println("\n-----Tambahkan Pesanan-----");
        System.out.print("Masukkan nama pelanggan: ");
        String nama = sc5.nextLine();
        System.out.print("Masukkan nomor meja: ");
        int nomor = sc5.nextInt();
    
        namaPelanggan[jumlahPesanan] = nama;
        nomorMeja[jumlahPesanan] = nomor;

        System.out.println("\n===== MENU KAFE =====");
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.println((i + 1) + ". " + namaMenu[i] + " - Rp " + hargaMenu[i]);
        }

        double totalPesanan = 0;
        while (true) {
    
            System.out.print("\nPilih menu (masukkan nomor menu, atau 0 untuk selesai): ");
            int pilihanMenu = sc5.nextInt();
            
            if (pilihanMenu == 0) {
                break;
            }
            if (pilihanMenu < 1 || pilihanMenu > namaMenu.length) {
                System.out.println("Menu tidak valid. Silahkan memilih lagi.");
                continue;
            }

            System.out.print("Masukkan jumlah item untuk " + namaMenu[pilihanMenu - 1] + ": ");
            int jumlah = sc5.nextInt();

            if (jumlah <= 0) {
                System.out.println("Jumlah item harus lebih dari 0. Silakan pilih lagi.");
                continue;
            }

            double hargaMenuDipilih = hargaMenu[pilihanMenu - 1];
            totalPesanan += jumlah * hargaMenuDipilih;
        }

        System.out.println("\nPesanan berhasil ditambahkan.");
        System.out.println("Total harga pesanan: Rp " + totalPesanan);
    }
    
    static void tampilkanDaftarPesanan(){
    }

}