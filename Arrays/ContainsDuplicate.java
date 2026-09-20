class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();         //Hashset is a java collection which stores only unique elements  
                                                        // <Integer> means type of data stored and set is a variable name

        for (int i = 0; i < nums.length; i++) {         

            if (set.contains(nums[i])) {              // here checks whether the element in i th position is already there in a set
                return true;                          // if yes it will returns true and program will end here
            }

            set.add(nums[i]);                         // if the set is not contains the element of i th position then that element will added
        }

        return false;                                // if the set doesn't have a duplicate value after all iterations it will return false
    }
}
