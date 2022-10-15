public class Q9 {
    public static void main(String[] args) {
int y = 123321;
        System.out.println(isPalindrome(y));
    }
  static  boolean isPalindrome(int x) {

return true;
         }
int Search(int []nums, int target , boolean Findindex){
    int start = 0;
    int x =0;
    int end = nums.length - 1;

    while (start <= end) {


        int mid = start + (end - start) / 2;
        if (target < nums[mid]) {
            end = mid - 1;
        } else if (target > nums[mid]) {
            start = mid + 1;

        } else {
            x = mid;
            if (Findindex) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
    }
        return x;
}
}
