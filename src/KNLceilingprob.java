public class KNLceilingprob {
    public static void main(String[] args) {
        int[] arr2 = {2, 3, 4, 5, 6, 8, 9, 10};
        System.out.println(Ceiling(arr2, 7));
    }

    static int Ceiling(int[] arr, int target) {
        int start =arr[0];
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end =  arr[mid - 1];
            } else if (target > arr[mid]) {
                start =  arr[mid + 1];
            }else {
                return arr[mid] ;

        }
    }
return start;
    }

}