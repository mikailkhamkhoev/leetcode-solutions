// Time Complexity: O(n * m log m)
// Space Complexity: O(n * m)

class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        if (strs.isEmpty) return listOf()

        val map = mutableMapOf<String, MutableList<String>>()

        for (word in strs) {

            val chars = word.toCharArray()
            chars.sort()
            val sortedKey = String(chars)

            if (!map.containsKey(sortedKey)) {
                map[sortedKey] = mutableListOf()
            }

            map[sortedKey]?.add(word)
        }

        return map.values.toList()
    }
}