import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Masukan nama: ");
        String nama = newScanner.nextLine();

        System.out.println("Masukan nim: ");
        String nim = newScanner.nextLine();

        System.out.println("nim mahasiswa dengan nama " + nama + " adalah " + nim);
    }
}