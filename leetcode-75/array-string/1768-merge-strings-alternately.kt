// Time complexity: O(n+m)
// Space complexity: O(n+m)

class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val result = StringBuilder()
        val n = word1.length
        val m = word2.length
        val maxLength = maxOf(n, m)

        for (i in 0..<maxLength) {
            if (i < n) result.append(word1[i])
            if (i < m) result.append(word2[i])
        }

        return result.toString()
    }
}
