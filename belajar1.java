import java.util.Scanner;

public class belajar1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan nama anda");
        String nama = scanner.nextLine();

        System.out.println("masukkan kesibukan anda");
        String kesibukan = scanner.nextLine();

        System.out.println("masukkan rt_rw anda");
        String rt_rw = scanner.nextLine();

        System.out.println("masukkan hobi anda");
        String hobi = scanner.nextLine();

        System.out.println("masukkan nim anda");
        String nim = scanner.nextLine();

        System.out.println("nama" + nama);
        System.out.println("kesibukan" + kesibukan);
        System.out.println("rt_rw" + rt_rw);
        System.out.println("hobi" + hobi);
        System.out.println("nim" + nim);
    }
}
