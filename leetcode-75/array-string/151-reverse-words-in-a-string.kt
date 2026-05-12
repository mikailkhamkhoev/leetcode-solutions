// Time complexity: O(n)
// Space complexity: O(n)

class Solution {
    fun reverseWords(s: String): String {
        val words = s.trim().split(" ")

        return words.filter { it.isNotEmpty() }.reversed().joinToString(" ")
    }
}
