public class Daily_485MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1) {
                count++;
                res = Math.max(count, res);
            }
            else count = 0;
        }
        return res;
    }
}
