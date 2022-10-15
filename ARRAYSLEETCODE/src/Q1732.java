public class Q1732 {
    public static void main(String[] args) {
        int[] arr = {-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }

    static int largestAltitude(int[] gain) {
int max=0;
int []res = new int [gain.length +1];
for (int i =1 ; i < res.length; i++){
    res[i]= res[i-1]+gain[i-1];
    max = Math.max(max,res[i]);
}
    return max;
    }
}