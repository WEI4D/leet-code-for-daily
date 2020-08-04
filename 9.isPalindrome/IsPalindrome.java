import java.util.LinkedList;
class IsPalindrome {
    public boolean isPalindrome(int x) {
        if( x/10 > Integer.MAX_VALUE || x/10 < Integer.MIN_VALUE || x < 0  ){
            return false;
        }
        LinkedList<Integer> container = new LinkedList<Integer>();
        while( x / 10 !=0 ){
            int remainder = x % 10;
            x = x / 10;
            container.add(remainder);
        }
        container.add(x);
        int size = container.size();
        System.out.print("size: ");
        System.out.println(size);
        int p = 0, q = container.size() - 1;
        int count = 0;
        if( p == q ){
            return true;
        }
        while( p < size/2 ){
            if(container.get(p++) == container.get(q--)){
                count++;
                continue;
            }else{
                return false;
            }
        }
        System.out.print("count: ");
        System.out.println(count);
        if( count == size/2 ){ return true; }else{ return false; }
    }
    public static void main(String[] args) {
        IsPalindrome p = new IsPalindrome();
        System.out.println(p.isPalindrome(1111));
    }
}