/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

// With recursion
// class Solution {
//     fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
//         if (root == null) return null
//         if (root.`val` == `val`) return root
//         if (root.`val` < `val`) return searchBST(root.right, `val`)
//         return searchBST(root.left, `val`)
//     }
// }

class Solution {
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        var current = root

        while (current != null) {
            if (current.`val` == `val`) return current
            else if (current.`val` < `val`) current = current.right
            else current = current.left
        }

        return current
    }
}