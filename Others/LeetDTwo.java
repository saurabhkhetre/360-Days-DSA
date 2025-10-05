public class LeetDTwo {
    public static void main(String args[]){
        Solution Sol = new Solution();
        System.out.println(Sol.RomanToInt("MCMXCIV"));
    }
    
}

class Solution{
    public int getvalue(char ch){
        switch(ch){

            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M': return 1000;
            default : return 0;


        }
    }

    int RomanToInt(String s){
        int n = s.length();
        int sum = 0;

        for(int i = 0; i< n;i++){
            int ch1 = getvalue(s.charAt(i));

            if(i+1<n && ch1 < getvalue(s.charAt(i+1))){
                sum =sum - ch1;
            }else{
                sum = sum+ ch1;

            };
        }
        return sum;
    }
}
