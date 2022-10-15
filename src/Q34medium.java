import java.util.Arrays;

//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//If target is not found in the array, return [-1, -1].
//
//You must write an algorithm with O(log n) runtime complexity.



public class Q34medium {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(arr, 7)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] out = {-1, -1};
        int start = Search(nums, target, true);
        int end = Search(nums, target, false);

        out[0] = start;
        out[1] = end;
        return out;
    }

    static int Search(int[] nums, int target, boolean FindIndex) {
        int out = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {


            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;

            } else {
                out = mid;
                if (FindIndex) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            }
        }
    return out;
    }
}