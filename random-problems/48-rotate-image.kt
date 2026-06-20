// Time Complexity: O(n^2)
// Space Complexity: O(1)

class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {
        val n = matrix.size
        
        for (i in 0 until n) {
            for (j in i + 1 until n) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
            }
        }

        for (i in 0 until n) {
            for (j in 0 until n / 2) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[i][n - 1 - j]
                matrix[i][n - 1 - j] = temp
            }
        }
    }
}