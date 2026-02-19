/*
Given an integer array `nums` sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
Consider the number of unique elements in nums to be `k`​​​​​​​​​​​​​​. After removing duplicates, return the number of unique elements `k`.
The first `k` elements of `nums` should contain the unique numbers in sorted order. The remaining elements beyond index `k - 1` can be ignored.

Example:
Input: `nums = [1,1,2]`
Output: `2`, `nums = [1,2,_]`
Explanation: `Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).`
  */
class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int slow=0;
       
        for(int fast=1;fast<n;fast++){
            if(nums[slow]!=nums[fast]){
                 slow++;
                 nums[slow]=nums[fast];
            }
        }
        return slow+1;
    }
}
/*
Intuition:
Since the array is sorted ,all duplicate elements will be next to each other.So we can use two pointers:
slow pointer-> keeps the track of the position of the last unique element
fast pointer -> scans the array to find new unique elements.
Whenever `nums[fast] !=nums[slow]` , we found a new unique number, so we move `slow` forward and copy that number there.
This way, all unique elements are moved to the front of the array.

Approach:
1.Start `slow = 0` (first element is always unique).
2.Loop `fast` from `1` to `n-1`.
3.If `nums[fast] != nums[slow]`
Increase `slow`
Copy `nums[fast]` to `nums[slow]`
4.After loop ends, number of unique elements = `slow + 1`.

Complexity:
Time complexity:
O(n)->Becuase we traverse the array only once using the fast pointer.
Space complexity:
O(1)->We are modifying the array in-place and using only a few varibles.  
 */ 
  
