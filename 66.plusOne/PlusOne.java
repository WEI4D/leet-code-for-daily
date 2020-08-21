import java.util.Arrays;

class PlusOne{
    public int[] plusOne(int[] digits) {
        int[] digitsCopy = digits;
        int carry = 0;
        for(int i = digitsCopy.length - 1;i >= 0;i--){
            int result = digitsCopy[i] + carry;
            if(i == digitsCopy.length-1){
                result = result+1;
            }
            if(result >= 10){
                digitsCopy[i] = result % 10;
                carry = result / 10;
            }else{
                digitsCopy[i] = result;
                break;
            }
        }
        if(digitsCopy[0] == 0 && digitsCopy.length > 1 || digits[0] == 9 && digits.length == 1){
            
        }
        return digits;
    }
    public static void main(String[] args) {
        PlusOne p = new PlusOne();
        int[] digits = { 0 };
        System.out.println(Arrays.toString(p.plusOne(digits)));
    }
}