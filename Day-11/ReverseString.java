public class ReverseString {

    public static void reversestring(String[] s){
        String temp;
        int n =  s.length-1;
        for(int i = 0;i < s.length/2;i++)
        {
           
                temp = s[i];
                s[i] = s[n];
                s[n] = temp;
                n--;
        }
    }
    public static void main(String args[]){
        String[] s = {"H","a","n","n","a","h"};
        reversestring(s);
        for(int i = 0;i< s.length;i++){
            System.out.print(s[i]+" ");
        }
    }
}
