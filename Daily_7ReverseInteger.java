public class Daily_7ReverseInteger {
    public static void main(String[] args) {
        int n = -2147483412;
        System.out.println(reverse(n));
    }
    public static int reverse(int x){
        int res = 0;
        while(x != 0){
            if((res < Integer.MIN_VALUE|| res > Integer.MAX_VALUE / 10))
                return 0;
            res = res * 10 + x % 10;
            x /= 10;
        }
        return res;
    }

}
