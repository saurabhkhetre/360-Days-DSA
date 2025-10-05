public class LastWordlength{

    public static int GetLength(String s){
        int count = 0;
        int n = s.length()-1;
        
        while(n >=0 && s.charAt(n) ==  ' '){
            n--;
        }

        while(n >=0 && s.charAt(n) != ' '){
            count ++;
            n--;
        }
        return count;
    }
    public static void main(String args[]){
        String s = "   fly me   to   the moon  ";
        System.out.println("Length of Last Word of String "+s+" is "+GetLength(s));
    }
}