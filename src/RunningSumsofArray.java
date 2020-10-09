public class RunningSumsofArray {


    public static int[] runningSum(int[] nums) {
        int[] tempnum = new int[nums.length];

        for(int num =0;nums.length>num;num++){
            if(num == 0){
                tempnum[num] = nums[num];
            } else {
                tempnum[num] = nums[num] + tempnum[num-1];
            }

        }
        return tempnum;

    }

    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        runningSum(nums);
    }
}
