public class Daily_20Valid_Parentheses {
    public static void main(String[] args) {
        String s = "{}()[";
        System.out.println(isValid(s));
    }
    
    public static boolean isValid(String s){

    }

    public static boolean isValid_Test(String s) { //s = "{[]}" - Sai
        if(s.contains("()") || s.contains("{}") || s.contains("[]")){
            s = s.replace("()","");
            s = s.replace("[]","");
            s = s.replace("{}","");
        }
        return s.isEmpty();
    }
}
