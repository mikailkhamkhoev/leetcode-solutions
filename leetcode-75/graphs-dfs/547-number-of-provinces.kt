// Time Complexity: O(n^2)
// Space Complexity: O(n)

class Solution {
    fun findCircleNum(isConnected: Array<IntArray>): Int {
        val n = isConnected.size
        val visited = BooleanArray(n) {false}
        var provinces = 0

        fun dfs(city: Int) {
            visited[city] = true
            for (neighbor in 0 until n) {
                if (isConnected[neighbor][city] == 1 && !visited[neighbor]) {
                    dfs(neighbor)
                }
            }
        }

        for (city in 0 until n) {
            if (!visited[city]) {
                provinces++
                dfs(city)
            }
        }


        return provinces
    }
}