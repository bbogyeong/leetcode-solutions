class Solution {
    public int search(int[] nums, int target) {
        int front= 0; int back= nums.length- 1;
        // Binary search: repeatedly compare target with the mid value and narrow the range
        while(front<= back){
            int mid= (back+ front)/ 2;
            if(target== nums[mid]){
                return mid;
            }else if(target> nums[mid]){
                front= mid+ 1;
                // Target is in the right half, move left boundary up
            }else{
                back= mid- 1;
                // Target is in the left half, move right boundary down
            }
        }
        return -1;
    }
}