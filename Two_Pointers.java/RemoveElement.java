/*
Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in `nums` in-place. The order of the elements may be changed. Then return the number of elements in `nums` which are not equal to `val`.
Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
Change the array `nums` such that the first `k` elements of `nums` contain the elements which are not equal to `val`. The remaining elements of `nums` are not important as well as the size of `nums`.
Return `k`.

Example:
Input: `nums = [3,2,2,3]`, `val = 3`
Output: 2, nums = [2,2,_,_]
Explanation: `Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores)`.  
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        int slow=0;
        for(int fast=0;fast<nums.length;fast++){
            if(nums[fast]!=val){
                nums[slow]=nums[fast];
                slow++;
                
            }
        }
        return slow;
    }
}
/*
Intuition
We need to:
1.Remove all occurrences of val
2.Do it in-place:
3.Return the number of remaining elementsk
4.Order does NOT matter
So we use two pointers:
fast → scans every element
slow→ places valid elements (not equal to val)
Whenever we see a number not equal to val, we copy it to position slow and move slow forward.
  
Approach:
1.Initialize a pointer slow = 0.
(This pointer represents the position where the next valid (non-val) element should be placed.)
2.Traverse the array using another pointer fast from 0 to nums.length - 1.
For each element:
If nums[fast] != val:
Copy nums[fast] to nums[slow]
Increment slow
After the loop ends:
The first slow elements of the array contain all elements not equal to val.
Return slow as the number of valid elements (k).

Complexity:
Time complexity:O(n)
Space complexity:O(1) 
*/  
