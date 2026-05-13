// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
    fun compress(chars: CharArray): Int {
        var write = 0
        var read = 0

        while (read < chars.size) {
            val currentChar = chars[read]
            var count = 0

            while (read < chars.size && chars[read] == currentChar) {
                read++
                count++
            }

            chars[write++] = currentChar

            if (count > 1) {
                for (digit in count.toString()) {
                    chars[write++] = digit
                }
            }
        }

        return write
    }
}
