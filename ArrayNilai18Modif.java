import java.util.Scanner;

public class ArrayNilai18Modif {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir untuk mahasiswa ke-" + (i + 1) + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        System.out.println(" "); // spasi untuk jarak
        
        System.out.println("Hasil Nilai Mahasiswa:");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " lulus!");
            } else {
                System.out.println("Mahasiswa ke-" + i + " tidak lulus!");
            }
        }        
        
        sc.close();
    }
}



