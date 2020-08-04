import java.util.LinkedList;
class IsPalindrome {
    public boolean isPalindrome(int x) {
        if( x/10 > Integer.MAX_VALUE || x/10 < Integer.MIN_VALUE || x < 0  ){
            return false;
        }
        while( x / 10 !=0 ){
            int remainder = x % 10;
            
            x = x / 10;
        }

    }
    public static void main(String[] args) {
        
    }
}