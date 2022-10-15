public class Q69 {
    public static void main(String[] args) {
        int z = 40;
        System.out.println(mySqrt(z));
    }

    static int mySqrt(int x) {
        int z =0;
        int y;
        for(y=1;y<x;y++){
           if( x==y*y){
               return y;
           }else {
               z=x;
               return z;
           }
        }
     return z;

    }
}