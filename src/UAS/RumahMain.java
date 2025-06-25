package UAS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RumahMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RumahTersedia[] daftarRumah;

        System.out.print("Masukkan jumlah rumah yang ingin didaftarkan: ");
        int jumlah = 0;

        // 14. Error Handling untuk jumlah
        try {
            jumlah = input.nextInt();
            input.nextLine(); // flush newline
        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka. Program berhenti.");
            return;
        }

        // 13. Array
        daftarRumah = new RumahTersedia[jumlah];

        // 11. Perulangan
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Rumah ke-" + (i + 1));

            System.out.print("Nama Pemilik: ");
            String pemilik = input.nextLine();

            System.out.print("Tipe Rumah (Eco-Friendly / Kontainer / Minimalis): ");
            String tipe = input.nextLine();

            double luas = 0;
            // 14. Error Handling untuk luas
            while (true) {
                try {
                    System.out.print("Luas (m2): ");
                    luas = input.nextDouble();
                    input.nextLine(); // flush newline
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Luas harus berupa angka. Ulangi input.");
                    input.nextLine(); // flush error
                }
            }

            // 12. IO Sederhana untuk boolean
            boolean sensorListrik = false;
            boolean sensorAir = false;

            System.out.print("Sensor Listrik Aktif? (true/false): ");
            sensorListrik = input.nextBoolean();

            System.out.print("Sensor Air Aktif? (true/false): ");
            sensorAir = input.nextBoolean();
            input.nextLine(); // flush newline

            // 2. Object dibuat
            daftarRumah[i] = new RumahTersedia(pemilik, tipe, luas, sensorListrik, sensorAir);
        }

        // Menampilkan semua rumah yang sudah didaftarkan
        System.out.println("\n======= DAFTAR RUMAH TERDAFTAR =======");
        for (int i = 0; i < daftarRumah.length; i++) {
            System.out.println("Rumah ke-" + (i + 1));
            System.out.println(daftarRumah[i].displayInfo());
            System.out.println("-------------------------------------");
        }

        input.close();
    }
}
