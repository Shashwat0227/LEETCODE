public class Q1295 {
    public static void main(String[] args) {
        int[] arr = {23,344,123};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums) {
        int diff =0;
        int count = 0;
        int rem;
        for (int i = 0; i < nums.length; i++) {
            count=0;
            while (nums[i] != 0) {
                rem = nums[i] / 10;
                ++count;
                nums[i] = nums[i] / 10;
            }
                if(count%2==0){
                    diff ++;
                }
                }
    return diff;
    }
}