// Time complexity: O(n)
// Space complexity: O(n)

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun pathSum(root: TreeNode?, targetSum: Int): Int {
        val prefixSums = hashMapOf<Long, Int>()
        prefixSums[0L] = 1
        return dfs(root, 0L, targetSum.toLong(), prefixSums)
    }

    private fun dfs(
        node: TreeNode?,
        currentSum: Long,
        targetSum: Long,
        prefixSum: HashMap<Long, Int>
    ): Int {
        if (node == null) return 0

        val nextSum = currentSum + node.`val`

        var pathCount = prefixSum.getOrDefault(nextSum - targetSum, 0)

        prefixSum[nextSum] = prefixSum.getOrDefault(nextSum, 0) + 1

        pathCount += dfs(node.left, nextSum, targetSum, prefixSum)
        pathCount += dfs(node.right, nextSum, targetSum, prefixSum)

        prefixSum[nextSum] = prefixSum.getOrDefault(nextSum, 0) - 1

        return pathCount
    }
}