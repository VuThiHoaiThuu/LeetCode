public class Daily_263UglyNumber {
    public static void main(String[] args) {
        int n = 8;   
        System.out.println(isUgly(n));
    }
    
    public static boolean isUgly(int n) {
        if(n == 1) 
            return true;
        if(n % 2 == 0)
            return isUgly(n / 2);
        else if(n % 3 == 0)
            return isUgly(n / 3);
        else if(n % 5 == 0)
            return isUgly(n / 5);
        
        return false;
    }
}
 