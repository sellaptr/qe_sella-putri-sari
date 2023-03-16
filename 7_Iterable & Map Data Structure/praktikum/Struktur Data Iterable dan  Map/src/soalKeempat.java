import java.util.*;

public class soalKeempat {
    public static int[] getUniqueArray(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr2) {
            set.add(num);
        }
        List<Integer> list = new ArrayList<>();
        for (int num : arr1) {
            if (!set.contains(num)) {
                list.add(num);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 3, 5, 10, 16};
        int[] result = getUniqueArray(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
}
