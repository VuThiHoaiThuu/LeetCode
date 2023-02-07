public class Daily_1108Defanging_an_IPAddress {
    public static void main(String[] args) {
        String addString = "1.1.1.1";
        System.out.println(defangIPaddr(addString));
    }
    public static String defangIPaddr(String address) {
        StringBuilder newAdd = new StringBuilder();
        for(int i = 0; i < address.length(); i++){
            if(address.charAt(i) == '.')
                newAdd.append("[.]");
            else 
                newAdd.append(address.charAt(i));
        }
        return newAdd.toString();
    }
}
