/**
         * iterate through nums
         * checks if a key exists within hashtable
         * if not then add value to hashtable, otherwise return combination
 */


//brute force approach
 class Solution {
 	//O(n^2)
     
   public int[] twoSum(int[] nums, int target) {

for(int  i = 0;i<nums.length;i++){
    for(int y = i+1;y< nums.length;y++){
        if(nums[i]+nums[y] == target){
            return new int[] {i,y};
        }
    }
}
       return new int[] {-1,-1};
   }
 }


/**
         * iterate through nums
         * checks if a key exists within hashtable
         * if not then add value to hashtable, otherwise return combination
         O(n)
 */
OPTIMISED APPROACH
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> visitedNumber = new HashMap<>();
     int wantedNumber;
        for(int i = 0 ;i < nums.length;i++){
              wantedNumber = target - nums[i];
            if(visitedNumber.containsKey(wantedNumber)){
                return new int[] {i,visitedNumber.get(wantedNumber)};
                
            }
            visitedNumber.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}


