// Time complexity: O(n)
// Space complexity: O(n)

class Solution {
    fun predictPartyVictory(senate: String): String {
        val radiant = mutableListOf<Int>()
        val dire = mutableListOf<Int>()

        for (i in senate.indices) {
            if (senate[i] == 'R') {
                radiant.add(i)
            } else {
                dire.add(i)
            }
        }

        val n = senate.length
        var rIndex = 0
        var dIndex = 0

        while (rIndex < radiant.size && dIndex < dire.size) {
            val radiantPos = radiant[rIndex]
            val direPos = dire[dIndex]

            if (radiantPos < direPos) {
                radiant.add(radiantPos + n)
            } else {
                dire.add(direPos + n)
            }

            rIndex++
            dIndex++
        }

        return if (rIndex < radiant.size) "Radiant" else "Dire"
    }
}