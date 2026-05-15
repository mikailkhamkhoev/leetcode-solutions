// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
    fun largestAltitude(gain: IntArray): Int {
        var maxAltitude = 0
        var currAltitude = 0

        for (diff in gain) {
            currAltitude += diff
            if (currAltitude > maxAltitude) {
                maxAltitude = currAltitude
            }
        }

        return maxAltitude
    }
}