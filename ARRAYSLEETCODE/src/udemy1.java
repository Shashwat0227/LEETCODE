import java.lang.reflect.Array;
import java.util.Arrays;

public class udemy1 {
    //Write a program to find all pairs of integers whose sum is equal to a given number.

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(twoSum(arr,10)));

    }

   static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j > i; j--) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                }

            }
        }
return res;
    }
}
