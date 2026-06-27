// HashMap - store complement and index
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num= 0; num< nums.length; num++){
            if(map.containsKey(target- nums[num])){
                return new int[]{map.get(target- nums[num]), num};
            }
            map.put(nums[num], num);
        }
        return new int[]{};
    }
}