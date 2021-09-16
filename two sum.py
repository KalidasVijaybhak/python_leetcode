# The key to the problem is that there is ALWAYS only 1 pair of numbers that satisfy the condition of adding together to be the target value.
# We can assume that for all the numbers in the list (x1, x2, ... xn) that there exists a pair such that xa + xb = target
# To solve this with a single pass of the list we can change the equation above to xa = target - xb and since we know the target as long as we maintain a record of all previous values in the list we can compare the current value (xa) to it's ONLY pair, if it exists, in record of all previous values (xb)

# To keep a record of the previous values and their indices I have used a dictionary. Commonly known as a map in other languages. This allows me to record each previous number in the dictionary alongside the indice as a key value pair (target-number, indice).


class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        rev_table = dict()
        for i in range(len(nums)):
            second_addend = target - nums[i]
            if second_addend in rev_table:
        	    return [rev_table[second_addend], i]
            else:
        	    rev_table[nums[i]] = i