import  java.util.*;
public class soalKedua {
    public static void main(String[] args) {

        String input = "76523752";
        String input1 = "1122";
        List<Integer> randomAngka = angkaMuncul(input);
        System.out.println(randomAngka); // Output: [6, 3]
        List<Integer> rndomAngka = angkaTampil(input1);
        System.out.println(rndomAngka); // Output: []
    }

//    methode
    public static List<Integer> angkaMuncul(String input) {
        List<Integer> randomAngka = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (input.indexOf(currentChar) == input.lastIndexOf(currentChar)) {
                randomAngka.add(Character.getNumericValue(currentChar));
            }
        }
        return randomAngka;
}

    public static List<Integer> angkaTampil(String input1) {
        List<Integer> rndomAngka = new ArrayList<>();
        for (int i = 0; i < input1.length(); i++) {
            char currentChar = input1.charAt(i);
            if (input1.indexOf(currentChar) == input1.lastIndexOf(currentChar)) {
                rndomAngka.add(Character.getNumericValue(currentChar));
            }
        }
        return rndomAngka;
    }

}



