import java.util.Arrays;

public class CommonPrifix {

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        
        Arrays.sort(strs);

        char[] Fisrt = strs[0].toCharArray();
        char[] Last = strs[strs.length-1].toCharArray();

        for(int i = 0; i<Fisrt.length;i++){
            if(Fisrt[i] != Last[i]){
                break;
            }
            result.append(Fisrt[i]);
        }
    
        return result.toString();
    }
    public static void main(String args[]){
        String[] strs = {"flower","flow","flight"};  
        System.out.println(longestCommonPrefix(strs));      
    }
    
}
