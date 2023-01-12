public class Daily_66PlusOne {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] res = plusOne(nums);
        for(int i : res)
            System.out.print(i + "  ");
    }
    public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits  = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
