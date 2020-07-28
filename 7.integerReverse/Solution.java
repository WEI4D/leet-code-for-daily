class Solution{
    public int integerReverse(int num){
        int ans = 0;
        while( num != 0 ){
            int pop = num % 10;
            if( num > Integer.MAX_VALUE / 10 || ( ans == Integer.MAX_VALUE / 10 && pop > 7 ) ){
                return 0;
            }
            if( num < Integer.MIN_VALUE / 10 || ( ans == Integer.MIN_VALUE / 10 && pop < -8 ) ){
                return 0;
            }
            ans = ans*10 + pop
            num = num / 10;
        }
        return ans;
    }
}