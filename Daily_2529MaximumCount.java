public class Daily_2529MaximumCount {
    public static void main(String[] args) {
        int[] nums = {-3,-2,-1,0,0,1,2};
        System.out.println(maximumCount(nums));
    }
    public static int maximumCount(int[] nums){
        int positive = 0;
        int negative = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0)
                positive++;
            if(nums[i] < 0)
                negative++;
        }
        return positive > negative ? positive : negative;
    }
}
