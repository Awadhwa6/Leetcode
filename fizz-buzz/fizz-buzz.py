class Solution(object):
    def fizzBuzz(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        answer=[0]*n
        for x in range(n):
            if (x+1)%3 == 0 and (x+1)%5 == 0:
                answer[x]='FizzBuzz'
            elif (x+1)%3 == 0:
                answer[x]='Fizz'
            elif (x+1)%5 == 0:
                answer[x]='Buzz'
            else:
                answer[x]= str(x+1)
        return answer  
