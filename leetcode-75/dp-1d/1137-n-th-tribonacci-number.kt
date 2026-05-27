// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
    fun solve(n: Int): Int {
        if (n == 0) return 0
        if (n == 1 || n == 2) return 1

        var t0 = 0
        var t1 = 1
        var t2 = 1
        var t3 = 2

        for (i in 3..n) {
            t3 = t0 + t1 + t2
            t0 = t1
            t1 = t2
            t2 = t3
        }

        return t3
    }
}