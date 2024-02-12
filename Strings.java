import java.util.Scanner;

public record Strings() {
    public static void main(String[] args) {
        // Pendeklarasian Varibel
        int length;
        char subS1, subS2;

        // Pendeklarasian Objek Scanner
        Scanner in = new Scanner(System.in);

        // User diminta untuk menginputkan 2 kata
        System.out.print("Masukkan Kata : ");
        String kata1 = in.nextLine().toLowerCase();
        System.out.print("Masukkan Kata ke-2 : ");
        String kata2 = in.nextLine().toLowerCase();

        in.close();

        System.out.println("\n=======================================\n");
        // Penjumlahan dari panjang 2 kata yang telah diinputkan oleh user
        length = kata1.length() + kata2.length();
        System.out.println(length);

        // Mengambil huruf pertama yang dimiliki setiap kata
        subS1 = kata1.charAt(0);
        subS2 = kata2.charAt(0);

        // Membandingkan kedua huruf yang telah diambil
        if (subS1 > subS2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        System.out.println(kata1.substring(0, 1).toUpperCase() + kata1.substring(1) + " "
                + kata2.substring(0, 1).toUpperCase() + kata2.substring(1));
    }
}
