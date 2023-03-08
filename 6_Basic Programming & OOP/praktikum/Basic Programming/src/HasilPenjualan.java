import java.util.Scanner;
public class HasilPenjualan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah Harga Beli: ");
        int hargaBeli = scanner.nextInt();
        System.out.print("Masukkan sebuah Harga Jual: ");
        int hargaJual = scanner.nextInt();

//        menghitung laba atau rugi
        int labaRugi = hargaJual - hargaBeli;


//      hasil perhitungan dengan kondisi
        System.out.print("Output: ");

        switch (labaRugi) {
            case 0:
                System.out.println("sama saja");
                break;
            default:
                if (labaRugi > 0) {
                    System.out.println("untung sebesar: " + (labaRugi));
                } else {
                    System.out.println("rugi sebesar: " + (labaRugi));
                }
                break;
        }

    }
}
