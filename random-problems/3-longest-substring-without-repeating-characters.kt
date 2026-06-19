// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val set = mutableSetOf<Char>()
        var maxLength = 0
        var left = 0

        while (right in s.indices) {
            while (set.contains(s[right])) {
                set.remove(s[left])
                left++
            }

            set.add(s[right])

            maxLength = maxOf(maxLength, right - left + 1)
        }

        return maxLength
    }
}