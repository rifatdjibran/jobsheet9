import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai mahasiswa yang akan diinput: ");
        int jumlahMahasiswa = scanner.nextInt();
        int[] daftarNilai = new int[jumlahMahasiswa];
        int jumlah = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            daftarNilai[i] = scanner.nextInt();
            jumlah += daftarNilai[i];
        }

        int nilaiMax = daftarNilai[0];
        int nilaiMin = daftarNilai[0];
        for (int nilai : daftarNilai) {
            if (nilai > nilaiMax) nilaiMax = nilai;
            if (nilai < nilaiMin) nilaiMin = nilai;
        }

        double rataRata = (double) jumlah / jumlahMahasiswa;

        System.out.print("Daftar nilai mahasiswa: ");
        for (int nilai : daftarNilai) {
            System.out.print(nilai + " ");
        }
        System.out.println();
        
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiMax);
        System.out.println("Nilai terendah: " + nilaiMin);
    }
}
