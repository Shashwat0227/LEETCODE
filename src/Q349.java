import java.util.ArrayList;

public class Q349 {
    public static void main(String[] args) {
        int[] arr1 ={2,3,4,1};
        int []arr2 = {3,4,5,6};
        System.out.println(intersection(arr1,arr2));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
          int[]nums = new int [nums1.length];
        for(int i =0; i <nums1.length;i++ ){
            for(int j=0; j <nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    list.add(nums1[i]);
                }
            nums[i]=list.get(i);
            }

        }
return nums;
    }
}
