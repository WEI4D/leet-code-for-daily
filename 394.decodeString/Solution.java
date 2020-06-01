import java.util.Collections;
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
                LinkedList<String> sub = new LinkedList<String>();
                while( !"[".equals(stk.peekLast())){
                    sub.addLast(stk.removeLast());
                };
                Collections.reverse(sub);
                stk.removeLast();
                int repTime = Integer.parseInt(stk.removeLast());
                StringBuffer ret = new StringBuffer();
                String o = getString(sub);
                while( repTime-- > 0  ){
                    ret.append(o);
                };
                stk.addLast(ret.toString());
            };
        }
        return getString(stk);
    }
    public String getDigit(String s){
        StringBuffer ret = new StringBuffer();
        while( Character.isDigit(s.charAt(ptr)) ){
            ret.append(s.charAt(ptr++));
        }
        return ret.toString();
    }
    public String getString(LinkedList<String> v){
        StringBuffer ret = new StringBuffer();
        for( String s : v ){
            ret.append(s);
        }
        return ret.toString();
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        String str =  s.decodeString("3[a]2[bc]");
        System.out.print(str);
    }
}