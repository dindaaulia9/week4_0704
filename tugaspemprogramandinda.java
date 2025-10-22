import java.util.Scanner;

public class tugaspemprogramandinda {
   public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      String nama, kota, provinsi, hobi, NIM, universitas, prodi;
      int umur, tahunLahir;
      float nomorHP;

    System.out.println("Masukkan nama anda:");
    nama = input.nextLine();

    System.out.println("Masukkan kota anda");
    kota = input.nextLine();

    System.out.println("Masukkan provinsi anda");
    provinsi = input.nextLine();

    System.out.println("Masukkan hobi");
    hobi = input.nextLine();

    System.out.println("Masukkan umur");
    umur = input.nextInt();
    input.nextLine();

    System.out.println("Masukkan tahunlahir");
    tahunLahir = input.nextInt();

    System.out.println("Masukkan nomorHP");
    nomorHP = input.nextFloat();

    System.out.println("Masukkan NIM");
    NIM = input.nextLine();

    System.out.println("Masukkan universitas anda");
    universitas = input.nextLine();

    System.out.println("Masukkan prodi anda");
    prodi = input.nextLine();

    System.out.println("BIODATA");
    System.out.println("nama="+nama);
    System.out.println("kota="+kota);
    System.out.println("provinsi="+provinsi);
    System.out.println("hobi="+hobi);
    System.out.println("umur="+umur);
    System.out.println("tahunLahir="+tahunLahir);
    System.out.println("nomorHP="+nomorHP);
    System.out.println("NIM="+NIM);
    System.out.println("universitas="+universitas);
    System.out.println("prodi="+prodi);

   }
}
