// Time complexity: O(n)
// Space complexity: O(n)

class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val res = IntArray(n)
        
        res[0] = 1
        for (i in 1..<n) {
            res[i] = res[i - 1] * nums[i - 1]
        }
        
        var postfix = 1
        for (i in n - 1 downTo 0) {
            res[i] *= postfix
            postfix *= nums[i]
        }
        
        return res
    }
//    classic approach:
//    fun productExceptSelf(nums: IntArray): IntArray {
//        val pref = IntArray(nums.size)
//        val post = IntArray(nums.size)
//
//        pref[0] = 1
//        for (i in 1..<nums.size) {
//            pref[i] = pref[i-1] * nums[i-1]
//        }
//
//        post[post.size - 1] = 1
//        for (i in nums.size - 2 downTo 0) {
//            post[i] = post[i+1] * nums[i+1]
//        }
//
//        val res = IntArray(nums.size)
//        for (i in nums.indices) {
//            res[i] = pref[i] * post[i]
//        }
//
//        return res
//    }
}
