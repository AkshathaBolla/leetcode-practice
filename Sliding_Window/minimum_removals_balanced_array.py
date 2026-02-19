class Solution(object):
  def minRemoval(self,nums,k):
    nums.sort()
    left=0
    max_len=0
    for right in range(len(nums)):
      while nums[right]>k*nums[left]:
        left+=1
      max_len=max(max_len,right-left+1)
    return len(nums)-max_len
