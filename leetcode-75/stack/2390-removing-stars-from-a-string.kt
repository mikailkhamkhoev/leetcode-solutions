// Time complexity: O(n)
// Space complexity: O(n)

class Solution {
    fun removeStars(s: String): String {
        val answer = StringBuilder()

        for (ch in s) {
            if (ch == '*') {
                // Strings cannot start with '*'
                answer.deleteCharAt(answer.length - 1)
            } else {
                answer.append(ch)
            }
        }

        return answer.toString()
    }
}