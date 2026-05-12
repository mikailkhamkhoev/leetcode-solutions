// Time complexity: O(n)
// Space complexity: O(n)

class Solution {
    fun reverseVowels(s: String): String {
        val chars = s.toCharArray()
        val vowels = "aeiouAEIOU"

        var left = 0
        var right = chars.size - 1

        while (left < right) {
            while (left < right && chars[left] !in vowels) {
                left++
            }

            while (right > left && chars[right] !in vowels) {
                right--
            }

            if (left < right) {
                val temp = chars[left]
                chars[left] = chars[right]
                chars[right] = temp

                left++
                right--
            }
        }

        return String(chars)
    }
}
