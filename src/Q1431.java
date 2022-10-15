import java.util.List;

public class Q1431 {
    public static void main(String[] args) {

    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        Boolean [] Final = new Boolean[candies.length];
        int[] result = new int[candies.length];
        for(int i =0; i < candies.length ;i++){
            for(int j =0; j< candies.length ;j++){
          result[i]= candies[i]+extraCandies;
          if(result[i]>=candies[i]){
              Final[i]= true;
          }else {
          Final[i]=false;
          }

            }
        }
    return List.of(Final);
    }
}
