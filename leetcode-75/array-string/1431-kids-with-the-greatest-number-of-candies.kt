// Time complexity: O(n)
// Space complexity: O(n)

class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val maxCandies = candies.maxOrNull() ?: 0
        return candies.map { it + extraCandies >= maxCandies }

//  Also we can use the iterative approach:
//        val answer = MutableList(candies.size) { false }
//
//        for (i in candies.indices) {
//            if (candies[i] + extraCandies >= maxCandies) {
//                answer[i] = true
//            }
//        }
//
//        return answer
    }
}
