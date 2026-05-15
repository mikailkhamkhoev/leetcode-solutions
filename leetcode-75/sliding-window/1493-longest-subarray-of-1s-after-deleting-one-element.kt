// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
    fun longestSubarray(nums: IntArray): Int {
        var left = 0
        var maxLength = 0
        var countZeros = 0

        for (right in nums.indices) {
            if (nums[right] == 0) countZeros++

            while (countZeros > 1) {
                if (nums[left] == 0) countZeros--
                left++
            }

            maxLength = maxOf(maxLength, right - left + 1)
        }

        return maxLength - 1
    }
}
