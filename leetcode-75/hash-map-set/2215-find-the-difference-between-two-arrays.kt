// Time complexity: O(n + m)
// Space complexity: O(n + m)

class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val set1 = nums1.toSet()
        val set2 = nums2.toSet()

        val answer1 = set1.filter { it !in set2 }
        val answer2 = set2.filter { it !in set1 }

        return listOf(answer1, answer2)
    }
}