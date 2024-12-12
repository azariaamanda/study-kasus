import java.util.Scanner;

public class ManajemenCafe {

    static String[] namaPelanggan = new String[100];
    static String[] namaMenu = {"Kopi Hitam", "Latte", "Cappuccino", "Mocha", "Espresso"};
    static int[] hargaMenu = {15000, 20000, 25000, 30000, 18000};
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

    }
    
    static void tampilkanDaftarPesanan(){

    }

}