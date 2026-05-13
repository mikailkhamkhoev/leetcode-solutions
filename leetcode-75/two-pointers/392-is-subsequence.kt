// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        if (s.isEmpty()) return true
        if (t.isEmpty()) return false

        var sPointer = 0

        for (tPointer in t.indices) {
            if (s[sPointer] == t[tPointer]) {
                sPointer++
            }

            if (sPointer == s.length) return true
        }

        return false
    }
}

//more elegant solution
//class Solution {
//    fun isSubsequence(s: String, t: String): Boolean {
//        var sPointer = 0
//        var tPointer = 0
//
//        while (sPointer < s.length && tPointer < t.length) {
//            if (s[sPointer] == t[tPointer]) {
//                sPointer++
//            }
//            tPointer++
//        }
//        
//        return sPointer == s.length
//    }
//}
