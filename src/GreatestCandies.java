import java.util.ArrayList;
import java.util.List;

public class GreatestCandies {



    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 4;
        nums[1] = 2;
        nums[2] = 1;
        nums[3] = 1;
        nums[4] = 2;
        greatestCandies(nums,1);
    }

    private static List<Boolean> greatestCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int highestNum = candies[0];
        for (int i=0; i<candies.length;i++){
            if(candies[i] > highestNum){
                highestNum = candies[i];
            }
        }

        for(int i=0; i<candies.length;i++){
            if(candies[i]+extraCandies >= highestNum){
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
