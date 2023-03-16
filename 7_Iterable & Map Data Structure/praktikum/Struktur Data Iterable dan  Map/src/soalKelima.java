import java.util.*;
public class soalKelima {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i];
            }
        }
        nums[j++] = nums[n - 1];
        return j;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 3, 3, 6, 9, 9};
        int[] nums2 = {2, 2, 2, 11};
        System.out.println("Panjang elemen array pertama setelah hapus duplikat adalah " + removeDuplicates(nums1));
        System.out.println("Panjang elemen array kedua setelah hapus duplikat adalah " + removeDuplicates(nums2));
    }


}
