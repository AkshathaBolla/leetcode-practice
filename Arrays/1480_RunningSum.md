Given an array `nums`. We define a running sum of an array as `runningSum[i] = sum(nums[0]…nums[i])`.
Return the `running sum of nums`.
Explanation:
Input: `nums = [1,2,3,4]`
Output: `[1,3,6,10]`
Explanation: Running sum is obtained as follows: `[1, 1+2, 1+2+3, 1+2+3+4]`.
Intuition:
A running sum means each position should store the sum of all numbers up to that index.
So once we know the sum till the previous index, we just add the current number to it.
Approach:
Create a `result `array to store the running sums.
Set the first value as it is (no elements before it).
For every next index:
add the current number to the previous running sum.
Return the result array.
```java
class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int[] res=new int[nums.length];
        res[0]=nums[0];
        for(int i=1;i<=nums.length-1;i++){
            res[i]=nums[i]+res[i-1];
        }
        return res;
    }
}
```
Complexity
Time complexity: O(n) — one pass through the array
Space Complexity: O(n) — extra array to store results
