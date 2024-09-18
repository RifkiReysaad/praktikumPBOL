import java.util.Scanner;

public class Tugas1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan NIM : ");
            int nim = scanner.nextInt();
            System.out.print("Masukkan Nama : ");
            String nama = scanner.next();
            System.out.println(nim);
            System.out.println(nama);
            scanner.close();
        }
}
