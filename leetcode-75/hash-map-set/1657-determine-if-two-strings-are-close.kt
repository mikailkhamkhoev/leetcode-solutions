// Time complexity: O(m + n)
// Space complexity: O(1)

class Solution {
    fun closeStrings(word1: String, word2: String): Boolean {
        if (word1.length != word2.length) return false

        val count1 = IntArray(26)
        val count2 = IntArray(26)

        for (ch in word1) count1[ch - 'a']++
        for (ch in word2) count2[ch - 'a']++

        for (i in 0..<26) {
            if ((count1[i] == 0 && count2[i] != 0) || (count1[i] != 0  && count2[i] == 0)) {
                return false
            }
        }

        count1.sort()
        count2.sort()

        return count1.contentEquals(count2)
    }
}