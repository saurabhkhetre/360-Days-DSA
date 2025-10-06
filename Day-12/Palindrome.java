public class Palindrome {

    public static boolean isPalindrome(String s){
        StringBuilder cleanstring = new StringBuilder();

        for(int i =0;i<s.length();i++){
            if (Character.isLetter(s.charAt(i))) {
                
                cleanstring.append(s.charAt(i));
            }
        }
        int n = cleanstring.length();
        for(int i = 0;i< n-1/2;i++){
            for(int j = n-1;j<n-1/2;j--){
                if (Character.toLowerCase(cleanstring.charAt(i)) != Character.toLowerCase(cleanstring.charAt(j))) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        String s = "race  car";
        System.out.println(isPalindrome(s));
    }
}
