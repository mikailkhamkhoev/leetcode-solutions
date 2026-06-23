// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val numSet = nums.toSet()
        var longest =  0

        for (num in numSet) {
            if (!numSet.contains(num - 1)) {
                var current = num
                var currLength = 1
            
                while (numSet.contains(current + 1)) {
                    current++
                    currLength++
                }

                longest = maxOf(longest, currLength)
            }
        }

        return longest
    }
}