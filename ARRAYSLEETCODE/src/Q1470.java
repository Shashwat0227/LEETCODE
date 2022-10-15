import java.util.Arrays;

public class Q1470 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(shuffle(arr, 3)));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        for (int j = n; j <2*n; j++) {
            for (int i = n; i < n; i++) {
                if (j % 2 == 0) {
                    nums[i] = res[i];
                }
            }




        }
 return res;
    }

}