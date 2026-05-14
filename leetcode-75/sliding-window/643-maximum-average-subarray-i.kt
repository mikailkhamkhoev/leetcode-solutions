// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var sum = 0
        for (i in 0..<k) {
            sum += nums[i]
        }
        var maxSum = sum
        
        for (i in k..<nums.size) {
            sum += nums[i] - nums[i - k]
            if (sum > maxSum) {
                maxSum = sum
            }
        }
        
        return maxSum.toDouble() / k
    }
}
