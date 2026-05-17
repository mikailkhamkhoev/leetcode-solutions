// Time complexity: O(n)
// Space complexity: O(n)

class Solution {
    fun decodeString(s: String): String {
        val countStack = ArrayList<Int>()
        val stringStack = ArrayList<StringBuilder>()
        var currentString = StringBuilder()
        var currentK = 0

        for (ch in s) {
            when {
                ch.isDigit() -> {
                    currentK = currentK * 10 + (ch - '0')
                }
                ch == '[' -> {
                    countStack.add(currentK)
                    stringStack.add(currentString)

                    currentString = StringBuilder()
                    currentK = 0
                }
                ch == ']' -> {
                    val k = countStack.removeLast()
                    val decodedString = stringStack.removeLast()

                    repeat(k) {
                        decodedString.append(currentString)
                    }
                    currentString = decodedString
                }
                else -> {
                    currentString.append(ch)
                }
            }
        }

        return currentString.toString()
    }
}