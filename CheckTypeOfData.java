import java.util.Scanner;
import java.math.BigInteger;

public class CheckTypeOfData {
    public static void main(String[] args) {
        int MIN_INT = -2147483648, MAX_INT = 2147483647;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah inputan: ");
        int jumlahInputan = in.nextInt();
        
        for (int i = 0; i < jumlahInputan; i++) {
            System.out.print("Masukkan angka yang akan dicek: ");
            BigInteger angka = in.nextBigInteger();
            String tipe = "";

            if (angka.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 && angka.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
                tipe += "- Byte\n";
            }
            if (angka.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 && angka.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
                tipe += "- Short\n";
            }
            if (angka.compareTo(BigInteger.valueOf(MIN_INT)) >= 0 && angka.compareTo(BigInteger.valueOf(MAX_INT)) <= 0) {
                tipe += "- Integer\n";
            }
            if (angka.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 && angka.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                tipe += "- Long\n";
            }
            if (tipe.isEmpty()) {
                tipe = "Cannot be fitted anywhere";
            }

            System.out.println("Angka " + angka);
            System.out.println("Termasuk ke dalam tipe:\n" + tipe);
        }

        in.close();
    }

    // Deklarasi MIN_INT dan MAX_INT sebagai konstanta di luar metode main
}
