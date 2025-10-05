// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's. Increment the large integer by one and return the resulting array of digits.
public class PlusOne{

    public static void plusOne(int[] digits){
        int k = 0;
        for(int i = 0;i<digits.length;i++){
            if(digits[i] != digits[digits.length -1]){
                digits[k] = digits[i];
                k++;
            }else{
                digits[digits.length -1] += 1;
            }
        }
       
    }
    public static void main(String args[]){
        int[] digits = {9,9,9};
        plusOne(digits);
        for(int i = 0; i<digits.length;i++){
            System.out.print(digits[i]+ " ");
        }
    }
}