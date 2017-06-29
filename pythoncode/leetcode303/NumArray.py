class NumArray(object):
    def __init__(self, nums):
        """
        :type nums: List[int]
        """
        self._look_up = [None] * len(nums)

        if len(nums) != 0:
            self._look_up[0] = nums[0]
            for index in range(1, len(nums)):
                self._look_up[index] = self._look_up[index - 1] + nums[index]


    def sumRange(self, i, j):
        """
        :type i: int
        :type j: int
        :rtype: int
        """
        if len(self._look_up) == 0:
            return 0
        if i == 0:
            return self._look_up[j]
        if i<0 or i >= len(self._look_up) or j <0 or j >= self._look_up or i > j:
            return 0
        return self._look_up[j] - self._look_up[i-1]

nums = []
obj = NumArray(nums)
print obj._look_up
print obj.sumRange(0, 2)

        # Your NumArray object will be instantiated and called as such:
        # obj = NumArray(nums)
        # param_1 = obj.sumRange(i,j)