class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int p = 0;
        for( int q = 1;q < nums.length;q++ ){
            if(nums[p] != nums[q] ){
                p++;
                nums[p] = nums[q];
            }
        }
        return p + 1;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicates r = new RemoveDuplicates();
        int res = r.removeDuplicates(nums);
        System.out.println(res);
    }
}