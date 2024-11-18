import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan yang ingin dibuat: ");
        int totalPesanan = input.nextInt();
        input.nextLine(); 

        String[] daftarPesanan = new String[totalPesanan];
        int[] hargaItem = new int[totalPesanan];
        int jumlahBiaya = 0;

        for (int i = 0; i < totalPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            daftarPesanan[i] = input.nextLine();
            System.out.print("Masukkan harga untuk " + daftarPesanan[i] + ": ");
            hargaItem[i] = input.nextInt();
            input.nextLine(); 
            jumlahBiaya += hargaItem[i];
        }

        System.out.print("Daftar pesanan Anda: ");
        for (int i = 0; i < totalPesanan; i++) {
            System.out.print((i + 1) + ". " + daftarPesanan[i] + " - Rp " + hargaItem[i] + " ");
        }
        System.out.println();
        System.out.println("Total biaya pesanan: Rp " + jumlahBiaya);
    }
}
