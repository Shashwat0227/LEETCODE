import java.util.Arrays;

public class Q1480 {
    public static void main(String[] args) {
int []arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    static int[] runningSum(int[] nums) {


        int[] res = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {


            res[i]=nums[i];



        int  sum=res[i]+nums[i];
            }


    return runningSum(res);
    }

}