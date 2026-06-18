// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    fun rob(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        if (nums.size == 1) return nums[0]
        if (nums.size == 2) return maxOf(nums[0], nums[1])

    
        var prev2 = nums[0] // dp[i - 2] 
        var prev1 = maxOf(nums[0], nums[1]) // dp[i - 1]


        for (i in 2 until nums.size) {
            val current = maxOf(prev1, prev2 + nums[i])
            prev2 = prev1
            prev1 = current
        }

        return prev1
    }
}