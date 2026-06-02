// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        var prev2 = 0
        var prev1 = 0

        for (i in 2..cost.size) {
            val current = minOf(prev1 + cost[i - 1], prev2 + cost[i - 2])
            prev2 = prev1
            prev1 = current
        }

        return prev1
    }
}
