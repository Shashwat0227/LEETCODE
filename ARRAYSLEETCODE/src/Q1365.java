import java.util.Arrays;

public class Q1365 {
    public static void main(String[] args) {
        int[] arr = {6,4,5,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
   static int[] smallerNumbersThanCurrent(int[] nums) {
        int []res = new int [nums.length];
        for (int i =0; i < nums.length;i++){
            int count =0;
            for(int j=0; j <nums.length;j++){
                if(j!=i && nums[j]<nums[i]) {
              count ++;
                }
res[i]= count;
            }

        }
    return res;
    }

    }
