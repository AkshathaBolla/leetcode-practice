A `sentence` is a list of `words` that are separated by a single space with no leading or trailing spaces.
You are given an array of strings `sentences`, where each `sentences[i]` represents a single `sentence`.
Return the `maximum number of words` that appear in a single sentence.
Example 1:

Input: `sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]`
Output: `6`
Explanation: 
- The first sentence, "alice and bob love leetcode", has 5 words in total.
- The second sentence, "i think so too", has 4 words in total.
- The third sentence, "this is great thanks very much", has 6 words in total.
Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
```java
   class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords=0;
        for(String sent:sentences){
           
            String[] words=sent.split(" ");
            maxWords=Math.max(maxWords,words.length);
        }
        return maxWords;
    }
}
```
Approach:
First initialize the maxWords in any sentence to 0.
using for each loop to get a single sentence from the array of strings ,use the split function to get the number of words in each sentence.
Get the maximum number of words in any single sentence using the max(maxWords,words.length)
