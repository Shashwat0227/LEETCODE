public class Q367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }

   static boolean isPerfectSquare(int num) {
        for (int i = 1; i <= num; i++) {
            if (num%i==0&&num/i==i) {
                return true;
            }

        }
return false;
    }
}