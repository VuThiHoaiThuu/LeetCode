public class Daily_557ReverseWordsinaString {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] res = s.split(" "); 
        String ans = "";
        for(int i = 0; i < res.length; i++){
            StringBuilder str = new StringBuilder(res[i] + "");
            StringBuilder rev = str.reverse();
            if(i == res.length - 1)
                ans += rev + "";
            else
                ans += rev + " ";
        }
        return ans;
    }
}
