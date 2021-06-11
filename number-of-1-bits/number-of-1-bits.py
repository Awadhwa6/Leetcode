class Solution(object):
    def hammingWeight(self, n):
        """
        :type n: int
        :rtype: int
        """
        bits = 0
        while(n>0):
            if (n%2 != 0) :
                bits=bits+1
            n=int(n/2)
        return bits;
