// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var countZeros = 0
        var maxLength = 0
        var left = 0

        for (right in nums.indices) {
            if (nums[right] == 0) countZeros++

            while (countZeros > k) {
                if (nums[left] == 0) countZeros--
                left++
            }

            maxLength = maxOf(right - left + 1, maxLength)
        }

        return maxLength
    }
}
