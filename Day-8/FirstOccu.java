public class FirstOccu {

    public static int strStr(String haystack, String needle){
        if (needle.length() == 0 ) return 0;
        if (needle.length() > haystack.length()) return -1;
        for(int i = 0;i<haystack.length() - needle.length();i++){
            String part = haystack.substring(i, i + needle.length());

            if(part.equals(needle)){
                return i;
            }
        }   
        return -1;
    }

    public static void main(String args[]){
        String haystack = "sadbutsad", needle = "sad";
        String haystack1 = "A", needle1 = "A";
        System.out.println(strStr(haystack, needle));
    }
}
