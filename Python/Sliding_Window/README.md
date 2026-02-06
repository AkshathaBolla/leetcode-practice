# Sliding Window Problems
 This folder contains the Leetcode problems solved using the window sliding technique.
## 1 .Minimum Removals to make an array Balanced.
### Problem Statement:
You are given an integer array `nums` and an integer `k`.
An array is considered **balanced** if the value of its maximum element is at most k times the minimum element.
You may remove any number of elements from `nums`​​​​​​​ without making it empty.
Return the minimum number of elements to remove so that the remaining array is balanced.
Note: An array of size `1` is considered balanced as its maximum and minimum are equal, and the condition always holds true.

Example 1:
Input: nums = [2,1,5], k = 2
Output: 1
Explanation:
Remove nums[2] = 5 to get nums = [2, 1].
Now max = 2, min = 1 and max <= min * k as 2 <= 1 * 2. Thus, the answer is 1.
Example 2:
Input: nums = [1,6,2,9], k = 3
Output: 2
Explanation:
Remove nums[0] = 1 and nums[3] = 9 to get nums = [6, 2].
Now max = 6, min = 2 and max <= min * k as 6 <= 2 * 3. Thus, the answer is 2.
Example 3:
Input: nums = [4,6], k = 2
Output: 0
Explanation:
Since nums is already balanced as 6 <= 4 * 2, no elements need to be removed.
 Constraints:
 1 <= nums.length <= 10^5
1 <= nums[i] <= 10^9
1 <= k <= 10^5
Intuition:
we want to remove few elements as possible so that max element <=kmin element.
So instead of removing we can think what is the largest set of elements we can keep that satisfies the condition
Key Observation:After sorting the array:
The minimum of any chosen group is at the left end. The maximum of that group is at the right at so that the condition becomes very easy to check nums[right]<=k*nums[left].
For this we can use the technique of sliding window.
Because by using this method we expand by moving right and shrink by moving left when the condition breaks.
This lets us test all valid groups efficiently.
Approach
1.Sort the given array .
2.initialize two pointers:
left:start of the window(min)
right:end of window (max)
3.Move right forward to include more elements
4.If condition fails:
Move left forward until it becomes valid again
5.Track the max window size
Answer will be the `total elements-largest window size`
Complexity:
Time complexity:O(n log n)
Space complexity:O(n)
