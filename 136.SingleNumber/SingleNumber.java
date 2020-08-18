import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length <= 0){
            System.out.println("I");
            return nums[0];
        }
        for(int i = 0;i < nums.length-1;i++){
            if(i == 0 && nums[i] != nums[i+1]) return nums[0];
            if(i == 0 && nums[i] == nums[i+1] ) continue;
            if(i != 0 && nums[i] != nums[i+1] && nums[i] != nums[i-1]){
                return nums[i+1];
            }
            if(i+1 == nums.length-1 && nums[nums.length-1] != nums[i]){ 
                return nums[i+1];
            }
        }
        return nums[0];
    }
    public static void main(String[] args) {
        SingleNumber s = new SingleNumber();
        int[] nums = {1};
        System.out.println(s.singleNumber(nums));
    }
}