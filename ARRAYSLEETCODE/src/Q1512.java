public class Q1512 {
    public static void main(String[] args) {
       int []arr = {1,1,1,1};
        System.out.println(numIdenticalPairs(arr));
    }
 static int numIdenticalPairs(int[] nums) {
        int pairs=0;
        for (int j =0; j <nums.length;j++){
            for (int i=0; i <j ;i++){
                if(nums[i]==nums[j]&&i<j){
                    pairs++;
                }
            }

        }
        return pairs;
    }
}

