public class Daily_1446ConsecutiveCharacters {
    public static void main(String[] args) {
        String s = "abbcccddddeeeeedcba";
        System.out.println(maxPower(s));
    }

    public static int maxPower(String s){
        int count = 1;
        int max = 1;
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                count++;
                max = Math.max(count, max);
            }
            else count = 1;
        }
        return max;
    }
}
