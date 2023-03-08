public class LuasBangunDatar {
    public static void main(String[] args) {
        // segitiga
        float alas = 20;
        float tinggi = 25;
        int hasilSegitiga = (int) (0.5 * alas * tinggi);

        //menghitung luas segitiga
        System.out.print("Luas segitiga adalah :");
        System.out.println(hasilSegitiga);


        // persegi panjang
        float panjang = 40;
        float lebar = 6;
        int hasilPersegi = (int) (panjang * lebar);

        //menghitung luas persegi panjang
        System.out.print("Luas persegi panjang adalah :");
        System.out.println(hasilPersegi);


        // lingkaran
        double jari2 = 7;
        float phi = 3.14f;
        float hasilLingkaran = (float) (phi * jari2 *jari2);

        //menghitung luas lingkaran
        System.out.print("Luas Lingkaran adalah :");
        System.out.println(hasilLingkaran);
    }
}
