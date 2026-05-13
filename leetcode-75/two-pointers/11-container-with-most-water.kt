// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var maxWater = 0

        while (left < right) {
            var currWater = minOf(height[left], height[right]) * (right - left)
            maxWater = maxOf(currWater, maxWater)

            if (height[left] < height[right]) {
                left++
            } else {
                right--
            }
        }

        return maxWater
    }
}
