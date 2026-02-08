class Solution(object):
    def minimumDeletions(self, s):
       bcount=0
       deletions=0
       for c in s:
            if c=='b':
                bcount+=1
            else:
                deletions=min(deletions+1,bcount)
       return deletions
