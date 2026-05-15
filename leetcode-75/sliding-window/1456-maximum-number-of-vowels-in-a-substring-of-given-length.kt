// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
    fun maxVowels(s: String, k: Int): Int {
        var count = 0
        for (i in 0..<k) {
            count += countAsVowel(s[i])
        }
        var maxCount = count

        for (i in k..<s.length) {
            count += countAsVowel(s[i]) - countAsVowel(s[i - k])
            maxCount = maxOf(maxCount, count)
        }

        return maxCount
    }

    private fun countAsVowel(c: Char): Int {
        return if (c in "aeiouAEIOU") {
            1
        } else {
            0
        }
    }
}
