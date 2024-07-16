// import kotlin.math.min

// fun main() = with(System.`in`.bufferedReader()) {
//     val max = 10001
//     val (n, k) = readLine().split(" ").map { it.toInt() }
//     val dp = IntArray(k + 1) { max }
//     dp[0] = 0

//     for (i in 1..n) {
//         val value = readLine().toInt()

//         for (cnt in value..k) {
//             dp[cnt] = min(dp[cnt], dp[cnt - value] + 1)
//         }
//     }

//     print(if (dp[k] == max) -1 else dp[k])
// }

import kotlin.math.min

const val MAX = 100_001

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val v = List(n) { readLine().toInt() }.distinct()
    val dp = IntArray(k + 1) { MAX }
    dp[0] = 0

    v.forEach { value ->
        (value..k).forEach {
            dp[it] = min(dp[it], dp[it - value] + 1)
        }
    }
    println(if (dp[k] == MAX) -1 else dp[k])
}
