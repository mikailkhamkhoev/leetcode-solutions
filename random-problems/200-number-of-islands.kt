// Time Complexity: O(n * m)
// Space Complexity: O(n * m)

class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        if (grid.isEmpty()) return 0

        var islandCount = 0

        for (r in grid.indices) {
            for (c in grid[r].indices) {

                if (grid[r][c] == '1') {
                    islandCount++
                    dfs(grid, r, c)
                }
            }
        }

        return islandCount
    }

    private fun dfs(grid: Array<CharArray>, r: Int, c: Int) {
        if (r < 0 || c < 0 || r >= grid.size || c >= grid[r].size) {
            return
        }

        if (grid[r][c] == '0') {
            return
        }

        grid[r][c] = '0'

        dfs(grid, r + 1, c)
        dfs(grid, r - 1, c)
        dfs(grid, r, c + 1)
        dfs(grid, r, c - 1)
    }
}