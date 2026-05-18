// Time complexity: O(n^2)
// Space complexity: O(n^2)

class Solution {
    fun equalPairs(grid: Array<IntArray>): Int {
        val n = grid.size
        val rowMap = HashMap<List<Int>, Int>()

        for (i in 0..<n) {
            val rowList = grid[i].toList()
            rowMap[rowList] = rowMap.getOrDefault(rowList, 0) + 1
        }

        var pairCount = 0

        for (j in 0..<n) {
            val colList = ArrayList<Int>(n)
            for (i in 0..<n) {
                colList.add(grid[i][j])
            }
            pairCount += rowMap.getOrDefault(colList, 0)
        }

        return pairCount
    }
}