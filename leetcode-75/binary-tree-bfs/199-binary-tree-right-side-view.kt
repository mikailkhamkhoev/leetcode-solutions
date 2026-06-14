// Time Complexity: O(n)
// Space Complexity: O(n)

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
    fun rightSideView(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        if (root == null) return result

        val queue = ArrayDeque<TreeNode>()
        queue.addLast(root)

        while (queue.isNotEmpty()) {
            val levelSize = queue.size

            for (i in 0 until levelSize) {
                val currentNode = queue.removeFirst()

                if (i == levelSize - 1) {
                    result.add(currentNode.`val`)
                }

                currentNode.left?.let { queue.addLast(it) }
                currentNode.right?.let { queue.addLast(it) }
            }
        }

        return result
    }
}

/* another way:
class Solution {
    fun rightSideView(root: TreeNode?): List<Int> {

        val answer : MutableList<Int> = mutableListOf()

        fun rightSideRec(node: TreeNode?, level: Int) {

            if (node == null) return

            if (level == answer.size) answer.add(node.`val`)

            rightSideRec(node.right, level+1)

            rightSideRec(node.left, level+1)

        }

        rightSideRec(root, 0)

        return answer

    }
}
 */