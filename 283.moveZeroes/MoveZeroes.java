class MoveZeroes {
    //[0,1,0,3,12]
    public void moveZeroes(int[] nums) {
        int p = 0, q = nums.length - 1;
        while(p != q){
            if(nums[q] == 0) q--; 
            if(nums[p] != 0) p++;
            if(nums[p] == nums[q]) p++;
            if(nums[p]){

            }
            int temp = nums[p];
            nums[p] = nums[q];
            nums[q] = temp;
        }
        System.out.print(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        MoveZeroes m = new MoveZeroes();
        int[] nums = {0,1,0,3,12};
        MoveZeroes.moveZeroes(nums);
    }
}