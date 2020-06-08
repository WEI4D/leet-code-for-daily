import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> occ = new HashSet<Character>();
        int len = s.length();
        int rk = -1, result = 0;
        for( int i = 0;i < len;i++ ){
            if( i != 0 ){
                occ.remove(s.charAt(i-1));
            }
            while( rk + 1 < len && !occ.contains(s.charAt(rk + 1))  ){
                occ.add(s.charAt(rk + 1));
                rk++;
            }
            result = Math.max(result, rk-i+1);
        }
        return result;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.print(s.lengthOfLongestSubstring("ahsdhaofgoawi"));
    }
}