#Greedy Algorithms
This folder contains LeetCode problems solved using the **Greedy Approach**.
Grredy algorithms make the **locally optimal choice at each step** with the hope of finding a global optimum.
##  Common Greedy Patterns
- Making optimal decisions at each step
- Choosing minimum or maximum cost locally
- Using counters or running variables
- Often combined with Dynamic Programming (state compression)

1.LeetCode-1653| Minimum Deletions to Make String Balanced|Greedy choice between deleting `'a'` or previous`'b'`
# Problem Statement:
You are given a string `s` consisting only of characters `'a'` and `'b'`​​​​.
You can delete any number of characters in `s` to make `s` balanced. `s` is balanced if there is no pair of indices `(i,j)` such that `i < j` and `s[i] = 'b'` and `s[j]= 'a'`.
Return the minimum number of deletions needed to make `s ` balanced.

## Intuition
The string `s` is balanced if all `a` characters appear before any `b` characters.
So the pattern like `ba` is invalid.
While scanning the string from left to right:
A `b `is harmless initially.
An `a` after a `b` creates a conflict.

At each such conflict, we have two choices:
Delete the current `a`.
Delete one of the previous `b`s.
To minimize deletion, we greedily choose the cheaper option at every step.

Observation:
When we encounter an `a`:

`deletions+1` is the cost of deleting this `a`
`bcount` is the cost of deleting all the previous `b`s

So we simply use `min(deletions+1,bcount)`
This guarantees the minimum deletions up to that point.
## Approach
1.Initialize:
`bcount=0` -> is the no.of b characters seen so far
`deletion=0`-> minimum deletions required
2.Traverse the string character by character:

If the character is `b` then increment the `bcount`
If the character is `a` :
Decide whether to delete this `a` or
previous `b`s.
Update `deletions=
min(deletions+1, bcount)`
3.Return `deletions` as the final answer.
## Complexity
Time complexity:O(n)
(where `n` is the length of the string)

Space complexity:O(1)
(Only 2 integer variables are used
no extra data structures)
