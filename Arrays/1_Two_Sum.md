# Two Sum
## Problem Statement
Given an array of integers `nums` and an integer `target`,
return indices of the two numbers such that they add up to `target`.

You may assume that each input would have exactly one solution,
and you may not use the same element twice.
### Approach
I used a HashMap to store numbers and their indices.
Traverse the array for each element `nums[i]` , compute it's complement `target-nums[i]`
we'll check if the `complement` already exists in the hashmap if yes, we'll return the complement from the map and the current index.
       if no then we'll store the elements and it's index in the hashmap.
## Java Solution:
```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int need=target-nums[i];
            if(map.containsKey(need)){
                return new int[]{map.get(need),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
```
### Complexity Analysis:
  Time Complexity: O(n)
  Space Complexity: O(n)
 
