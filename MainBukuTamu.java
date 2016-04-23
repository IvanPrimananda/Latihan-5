package mainbukutamu;
import java.util.Scanner;
public class MainBukuTamu {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Masukan Jumlah Tamu           : ");
         int tamu = in.nextInt();
         for (int i = 0; i < tamu; i++) {
             System.out.println("           Tamu ke-"+(i+1));
             System.out.print("Masukan Nama Tamu            :");
             String nama = in.next();in.nextLine();
             System.out.print("Masukan Alamat Tamu          :");
             String alamat = in.next();in.nextLine();
             System.out.print("Masukan No.Hp Tamu           :");
             String noHp = in.next();
             BukuTamu.NamaTamu(nama, i);
             BukuTamu.noHp(noHp, i);
             BukuTamu.AlamatTamu(alamat, i);
             System.out.println("==================================================================================");
             System.out.println("                                   Daftar Tamu");
             System.out.println("==================================================================================");
             BukuTamu.Display();
             System.out.println("==================================================================================");
         }
  
    }
}
