import java.util.Arrays;

public class QUES1929 {
    public static void main(String[] args) {
        int [] check = {1,2,3,1};
getConcatenation(check);
    }
    static  int[] getConcatenation(int[] nums) {
        int []ans = new int [2* nums.length];
        for(int j=0; j<2* nums.length;j++)
        for (int i =0; i < nums.length ; i++){
          ans[i]=nums[i];
           ans[i+ nums.length]=nums[i];

           }

            System.out.println(Arrays.toString(ans));



       return ans;
    }
}
