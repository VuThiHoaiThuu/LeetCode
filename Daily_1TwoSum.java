public class Daily_1TwoSum{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,10,9};
        int target = 5;
        int[] res = TwoSum(nums, target);
        for(int i : res){
            System.out.print(i + "  ");
        }
    }
    public static int[] TwoSum(int[] nums, int target){
        for(int i = 0; i < nums.length - 1; i++)
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target)
                    return new int[] {i, j};
            }
        throw new RuntimeException();
    }
}

