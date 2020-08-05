class MyAtoi {
    public int myAtoi(String str) {
        str = str.trim();
        if( str.length() == 0 ){
            return 0;
        }
        if( !Character.isDigit(str.charAt(0)) && str.charAt(0) != '+' && str.charAt(0) != '-' ){
            return 0;
        }
        int ans = 0;
        /* sign - true - 正数
         * sign - false - 负数
        **/
        boolean sign = str.charAt(0) == '-';
        System.out.print(sign);
        int pointer = Character.isDigit(str.charAt(0)) ? 0 : 1;
        while( pointer < str.length() && Character.isDigit(str.charAt(pointer)) ){
            int tmp = (( sign ? Integer.MIN_VALUE : Integer.MAX_VALUE ) + ( str.charAt(pointer) - '0' ) ) / 10;
            if( ans < tmp ){
                return sign ? Integer.MIN_VALUE : Integer.MAX_VALUE; 
            }
            ans = ans * 10 - (str.charAt(pointer++) - '0');
        }
        return sign ? (int)ans : (int)-ans;
    }

    public static void main(String[] args) {
        MyAtoi m = new MyAtoi();
        int i = m.myAtoi("4193 with words");
        System.out.println("答案是：");
        System.out.println(i);
    }
}