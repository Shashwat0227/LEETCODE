public class Q35 {
    public static void main(String[] args) {
int []arr = {2,3,4,5,6,7,8,9};
        System.out.println(searchInsert(arr,6));

    }

    static int searchInsert(int[] nums, int target) {
        int start = Search(nums, target, true);
        int end = Search(nums, target, false);
        int x = 0;
        x = start;
        return x;

    }

    static int Search(int[] nums, int target, boolean FindIndex) {
        int start = 0;
        int x = 0;
        int end = nums.length - 1;

        while (start <= end) {


            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;

            } else {
                x = mid;
                if (FindIndex) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            }
            return x;
        }
        return start;
    }
}


