public class MyAtoiTest {
    public void test() {
        String str = "4193";
        int i = (str.charAt(0)-'0');
        System.out.print(i);
    }
    public static void main(String[] args) {
        MyAtoiTest m = new MyAtoiTest();
        m.test();
    }
}