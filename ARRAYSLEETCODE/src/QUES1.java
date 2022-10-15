import java.util.Arrays;

public class QUES1 {
    // TWO SUM
    public static void main(String[] args) {
        int[] arr= {2, 7, 11, 15};
        int [] result =Sum(arr,9);
        System.out.println(Arrays.toString(result));
    }

    static  int[] Sum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j=i+1;j<nums.length;j++){
            if (nums[i] + nums[j] == target) {

            return new int [] {i, j};
            }

            }
        }


        return nums;
    }
}
