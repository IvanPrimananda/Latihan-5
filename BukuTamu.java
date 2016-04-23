package mainbukutamu;
public class BukuTamu {
    private static String A [][] = new String[4][10];
    public static int id = 1;
    public static void NamaTamu(String nama, int idd) {
    String id = Integer.toString(idd);
    A[0][idd] = id;
    A[1][idd] = nama;
     }
public static void noHp(String noHp, int idd){
    A[2][idd] = noHp;
}
public static void AlamatTamu(String alamat, int idd) {
    A[3][idd] = alamat;
        }
public static void Display() {
         System.out.println("||\tID\t||\tNama\t||\tHp\t||\tAlamat\t||");
         for (int i = 0; i < id; i++) {
             for (int k = 0; k < 4; k++) {
                 System.out.print("\t"+A[k][i]+"\t||");
             }
            System.out.println("");
         }
         id++;
     }
    }
    

