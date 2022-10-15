

public class q1672 {
    public static void main(String[] args) {
        int[][] arr = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(maximumWealth(arr));
    }

    static int maximumWealth(int[][] accounts) {
        int sum = 0;
        for (int row = 0; row < accounts.length; row++) {
            int temp = 0;
            for (int col = 0; col < accounts[row].length; col++) {

                temp += accounts[row][col];

                sum = Math.max(sum, temp);
            }
        }
 return sum;
    }
}