/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 */

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun maxLevelSum(root: TreeNode?): Int {
        if (root == null) return 0

        var maxSum = Int.MIN_VALUE
        var maxLevel = 1
        var currentLevel = 1

        val queue = ArrayDeque<TreeNode>()
        queue.addLast(root)

        while (queue.isNotEmpty()) {
            val levelSize = queue.size
            var levelSum = 0

            for (i in 0 until levelSize) {
                val node = queue.removeFirst()
                levelSum += node.`val`

                node.left?.let { queue.addLast(it) }
                node.right?.let { queue.addLast(it) }
            }

            if (levelSum > maxSum) {
                maxSum = levelSum
                maxLevel = currentLevel
            }

            currentLevel++
        }

        return maxLevel
    }
}