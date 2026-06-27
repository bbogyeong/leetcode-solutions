class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> compare= new HashSet<>();
        for(int num= 0; num< nums.length; num++){
            if(compare.contains(nums[num])){
                return true;
            }else{
                compare.add(nums[num]);
            }
        }
        return false;
    }
}