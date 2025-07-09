class Solution {
    public int removeElement(int[] nums, int val) {
      
      //Starts with k = 0. It tells us where to put the next number that we want to keep.
      int k = 0;
      
      //go through each number in the array.
      for (int i = 0; i < nums.length; i++){
        // if the number is not equal to the value that is to be removed
        if(nums[i] != val) {
          
          //then we need to keep that number by putting it at the index k;
          nums[i] = nums[k];

          // move k to the next position
          k++;
        }
      }
      // at the end k tells us , how many numbers are left...that are not equal to the val.
    return k;
    }
}
          
