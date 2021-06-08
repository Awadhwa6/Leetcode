class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        for i in range(len(nums)):
            if i in nums:
                continue;
            else:
                return i;
        if not len(nums) in nums:
            return len(nums)