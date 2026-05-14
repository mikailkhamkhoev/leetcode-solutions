// Time complexity: O(n)
// Space complexity: O(n)

class Solution {
    fun maxOperations(nums: IntArray, k: Int): Int {
        val quantities = HashMap<Int, Int>()
        var count = 0

        for (num in nums) {
            val complement = k - num
            val complementCount = quantities[complement] ?: 0

            if (complementCount > 0) {
                quantities[complement] = complementCount - 1
                count++
            } else {
                val currentCount = quantities[num] ?: 0
                quantities[num] = currentCount + 1
            }
        }
        return count
    }
}
