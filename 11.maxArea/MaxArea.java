public class MaxArea {
    public int maxArea(int[] height){
        int res = 0;
        int p = 0, q = height.length - 1;
        while(p != q){
            int len = q - p;
            res = Math.min(height[p], height[q]) * len > res ? Math.min(height[p], height[q]) * len : res;
            if( height[p] <= height[q] ){
                p++;
            } else {
                q--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        MaxArea m = new MaxArea();
        int[] area = {1,8,6,2,5,4,8,3,7};
        int res = m.maxArea(area);
        System.out.println(res);
    }
}