class Solution {
    public int[] twoSum(int[] nums, int target) {
for(int i=0; i<nums.length; i++){         //i start from 0 
    for(int j=i+1; j<nums.length; j++){   //j start from i+1(1st index )
        if(nums[i]+nums[j]==target){      //if i+j is equal to target value
            return new int[]{i,j};        // it return the array of i and j, the new int[] is used to return i and j in array format
        }
    }
}
return new int[]{0,0};
    }
}
