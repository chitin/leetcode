class Solution:
    def climbStairs(self, n):
        if n < 3:
            return n
        p, q = 1, 2
        for i in range(n-2):
            p, q = q, p+q
        return q

solution = Solution()
print(solution.climbStairs(5))



