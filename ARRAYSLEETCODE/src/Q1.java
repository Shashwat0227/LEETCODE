import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int []arr = {1, 2,4,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
    static int[] twoSum(int[] nums, int target) {
        int[]res = new int [2];

        for (int i =0; i < nums.length ; i ++){
            for(int j=0; j <=i; j ++)
                if(nums[i]+nums[j]==target){
                    res[0]=j;
                    res[1]=i;
                }

        }
        return res;
    }
}

