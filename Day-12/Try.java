public class Try {
    public static void main(String args[]){
        System.out.println(Character.isLetter(','));


        StringBuilder cleanstring = new StringBuilder();

        String s = "A man, a plan, a canal: Panama";

        for(int i =0;i<s.length();i++){
          if (Character.isLetter(s.charAt(i))) {
                
                cleanstring.append(s.charAt(i));
            }
        };
        System.out.println(cleanstring);
    }
}
