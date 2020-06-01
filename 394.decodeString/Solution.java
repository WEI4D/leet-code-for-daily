import java.util.LinkedList;

class Solution{
    int ptr;
    public String decodeString(String s) {
        LinkedList<String> stk = new LinkedList<String>();
        ptr = 0;
        while( ptr < s.length() ){
            char chr = s.charAt(ptr);
            if( Character.isDigit(chr) ){
                String digits = getDigit(s);
                stk.addLast(digits);
            }else if( Character.isLetter(chr) || '[' == chr ){
                stk.addLast(String.valueOf(s.charAt(ptr++)));
            }else{
                ++ptr;
                
            }
            System.out.println(stk);
        }
        return "sad";
    }
    public String getDigit(String s){
        StringBuffer ret = new StringBuffer();
        while( Character.isDigit(s.charAt(ptr)) ){
            ret.append(s.charAt(ptr++));
        }
        return ret.toString();
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        s.decodeString("3[a]2[bc]");
    }
}