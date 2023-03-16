import  java.util.*;
public class soalKetiga {

    public static int[] twoSum(int[] angka, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < angka.length; i++) {
            int complement = target - angka[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(angka[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] angka = { 1, 2, 3, 4, 6 };
        int target = 6;
        int[] result = twoSum(angka, target);
        if (result != null) {
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("Tidak ada pasangan yang ditemukan.");
        }
    }

}
