public class Daily_509Fibonacci {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(Fibo(n));
        System.out.println(fib(n));
    }
    public static int Fibo(int n){
        if(n == 0)
            return 0;
        if(n <= 2)
            return 1;
        return Fibo(n - 1) + Fibo(n - 2);
    }
    public static int fib(int n){
        if(n == 0)
            return 0;
        if(n <= 2)
            return 1;
        int fibo = 0, fib1 = 1, fib2 = 1;
        for(int i = 3; i <= n; i++){
            fibo = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibo;
        }
        return fibo;
    }
}
