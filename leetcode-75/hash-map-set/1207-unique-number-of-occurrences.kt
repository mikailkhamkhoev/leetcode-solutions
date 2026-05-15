// Time complexity: O(n)
// Space complexity: O(n)

class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val count = HashMap<Int, Int>()

        for (num in arr) {
            count[num] = (count[num] ?: 0) + 1
        }

        return count.values.size == count.values.toSet().size
    }
}