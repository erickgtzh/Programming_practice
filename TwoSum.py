class Solution:
    def twoSum(self,nums,target):
        dic = {};
        for i in range(len(nums)):
            if nums[i] in dic:
                return [dic[nums[i]],i];
            dic[target-nums[i]] = i;
        return False
