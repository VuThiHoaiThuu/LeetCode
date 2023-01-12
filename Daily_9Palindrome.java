public class Daily_9Palindrome{
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        else{
            int res = x;
            int check = 0;
            while(x != 0){
                int temp = x % 10;
                check = check * 10 + temp;
                x /= 10;
            }
            if(check == res)
                return true;
            else return false;
        }
    }
}