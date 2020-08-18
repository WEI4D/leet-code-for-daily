import java.util.Arrays;

public class Rotate {
    public void rotateByViolence(int[] nums, int k) {
        int temp,previous;
        for(int i = 0;i < k;i++){
            previous = nums[nums.length-1];
            for(int j = 0;j < nums.length;j++){
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
        System.out.print(Arrays.toString(nums));
    }
    public void rotateByArray(int[] nums, int k) {
        int[] a = new int[nums.length];
        for(int i = 0;i < nums.length;i++){
            a[(i+k)%nums.length] = nums[i];
        }
        for(int i = 0;i < nums.length;i++){
            nums[i] = a[i];
        }
        System.out.print(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        Rotate r = new Rotate();
        int[] test = {7,8,1,4,5,3,0};
        // r.rotateByViolence(test, 3);
        r.rotateByViolence(test, 3);
    }
}