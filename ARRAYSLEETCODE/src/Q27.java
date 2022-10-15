import java.util.ArrayList;
import java.util.Arrays;

public class Q27 {
    //It should not give any other number it should leave space
    // Remove element from array
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4};

        System.out.println(Arrays.toString(removeElement(arr,3)));
    }

    static int[] removeElement(int[] nums, int val) {
       ArrayList<Integer> LOOP = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++) {
            if (nums[i] != val) {
                LOOP.add(nums[i]);
                nums[i]= LOOP.get(i);
            }
        }
        return nums;
    }
}
