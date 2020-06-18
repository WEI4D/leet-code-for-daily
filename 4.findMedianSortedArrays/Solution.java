public class Solution {
    public String longestPalindrome(String s){
        int len = s.length();
        if( len < 2 ){
            return s;
        }
        int maxLen = 1;
        int begin = 0;
        char[] charArr = s.toCharArray();
        for( int i = 0;i < len - 1;i++ ){
            for( int j = i + 1;j < len;j++ ){
                if( j - i + 1 > maxLen && isPalindrome(charArr, i, j) ){
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin,begin + maxLen);
    }

    public Boolean isPalindrome(char[] charArray, int left, int right) {
        while( left < right ){
            if( charArray[left] != charArray[right] ){
                return false;
            }
            left++;
            right++;
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}