import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicateByHashMap(int[] nums) {
        Map map = new HashMap();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i],i);
        }
        System.out.println(map.toString());
        if(map.size() < nums.length){
            return true;
        }
        //46ms 49M
        return false;
    }
    public boolean containsDuplicateByHashSet(int[] nums) {
        HashSet s = new HashSet();
        for(int x : nums){
            if(s.contains(x)) return true;
            s.add(x);
        }
        //8ms 46M
        return false;
    }
    public boolean containsDuplicateBySort(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0;i < nums.length-1;i++){
            if(nums[i]==nums[i+1]) return true;
        }
        //4ms 43.9M
        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicate c = new ContainsDuplicate();
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.print(c.containsDuplicateBySort(nums));
    }
}