public class Q771 {
    public static void main(String[] args) {
        char[] arr = {'c','d','e' };
        System.out.println(nextGreatestLetter(arr,'c' ));
    }
    static char nextGreatestLetter(char[] a, char x) {
        int n = a.length;

        if (x >= a[n - 1])   x = a[0];
        else    x++;

        int lo = 0, hi = n - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] == x)    return a[mid];
            if (a[mid] < x)     lo = mid + 1;
            else    hi = mid;
        }
        return a[hi];
    }
    }

