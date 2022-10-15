public class Q747 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1};
        System.out.println(dominantIndex(arr));
    }

    static int dominantIndex(int[] nums) {
        int val = -1;
        for (int i = 0; i < nums.length; i++) {


            if (nums[i] >= 2 * nums[i]) {
                val = i;
                i++;
                if (nums[i] == nums[i + 1]) {
                    val += i + 1;
                }

            }


            return val;
        }
 return val;
    }
}
