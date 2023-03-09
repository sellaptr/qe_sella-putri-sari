public class Enkripsi {

        private static String encrypt(String s) {
            String hasilEnkripsi = "";
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= 'A' && c <= 'Z') {
                    // Jika karakter tersebut adalah huruf besar, maka kita melakukan pergeseran karakter sebanyak 10
                    c = (char) ('A' + (c - 'A' + 10) % 26);
                } else if (c >= 'a' && c <= 'z') {
                    // Jika karakter tersebut adalah huruf kecil, maka kita melakukan pergeseran karakter sebanyak 10
                    c = (char) ('a' + (c - 'a' + 10) % 26);
                }
                hasilEnkripsi += c;
            }
            return hasilEnkripsi;
        }

        public static void main(String[] args) {
            System.out.println(encrypt("SEPULSA OKE")); // COZEVCK YUO
        }
    }

