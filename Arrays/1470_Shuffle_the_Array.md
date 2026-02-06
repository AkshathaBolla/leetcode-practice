## Problem Statement
You are given an integer array `nums` that represents a circular array. Your task is to create a new array `result` of the same size, following these rules:

For each index `i` (where `0 <= i < nums.length`):
- If `nums[i] > 0`: Start at index `i` and move `nums[i]` steps to the right in the circular array. Set `result[i]` to the value at the index where you land.
- If `nums[i] < 0`: Start at index `i` and move `abs(nums[i])` steps to the left in the circular array. Set `result[i]` to the value at the index where you land.
- If `nums[i] == 0`: Set `result[i] = nums[i]`.

Return the new array `result`.

**Note:** Since `nums` is circular, moving past the last element wraps around to the beginning, and moving before the first element wraps around to the end.

### Intuition
Firstly we see that the array given is a circular array so moving past right should bring me back to the start.Moving left past 0 brings me back to the end.
For every index `i`,we don't actually need to simulate step by step movement.Instead I just need to know where I finally land after moving `nums[i]` steps.
Index movement in circular array can be handled cleanly using modulo arithemetic .
So `Final position=(current position+number of steps) modulo size of the array`.

### Approach
first we get the length of array`(n)`.
Create a result array`(res)` of size n
For each index `i` if `nums[i]==0` then store 0 directly else we compute the final index using `(i+nums[i])%n`

 ```python
class Solution(object):
    def constructTransformedArray(self, nums):
        n=len(nums)
        res=[0]*n #creating and array of length n initialized with 0
        for i in range(n):
            if nums[i]==0:
                res[i]=0
            else:
                new_idx=(i+nums[i])%n
                res[i]=nums[new_idx]
        return res
```
### Complexity
Time complexity:O(n)
Space complexity:O(n)
        
        
