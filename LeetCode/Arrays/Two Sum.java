class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        // Loop through each pair of elements in the array
        for(int i = 0; i < nums.length - 1; i++) { // the first number
            for (int j = i + 1; j < nums.length; j++){ //  the second number
              //checking if the sum of the pair of numbers is equal to the target
                if(nums[i] + nums[j] == target) {
                  //to return the indices if a valid pair of numbers is found
                    return new int[]{i, j};
                }
            }
        }
                // If no solution is found, throw an exception.
                throw new IllegalArgumentException("No two sum solution found for the given input.");
    }
}
