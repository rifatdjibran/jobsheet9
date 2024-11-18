import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        String[] daftarMenu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama makanan atau minuman yang ingin Anda cari: ");
        String namaPesanan = input.nextLine();

        boolean ditemukan = false;
        for (String itemMenu : daftarMenu) {
            if (itemMenu.equalsIgnoreCase(namaPesanan)) {
                ditemukan = true;
                if (itemMenu.toLowerCase().contains("teh") || itemMenu.toLowerCase().contains("cappucino") || itemMenu.toLowerCase().contains("chocolate")) {
                    System.out.println("Minuman \"" + itemMenu + "\" tersedia di dalam menu.");
                } else {
                    System.out.println("Makanan \"" + itemMenu + "\" tersedia di dalam menu.");
                }
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Menu \"" + namaPesanan + "\" tidak tersedia.");
        }
    }
}
