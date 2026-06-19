package Leetcode;
//My Original Solution
public class Solution {
    //helper function to calculate combinations
    public long combination(int n, int r) {
        long result = 1;
        for (int i = 1; i <= r; i++) {
            result = result * (n - i + 1) / i;
        }
        return result;
    }

    public int climbStairs(int n) {
        long ways = 0;
        //lets assume steps of 2 are a and steps of 1 are b to reach n
        //then acc. to question, 2a + b = n ------ (i)
        //means total no. of ways would be the combinations of a and b that
        //satisfies equation (i)

        for (int a = 0; a <= n; a++){
            for(int b = 0; b <= n; b++){
                if ((2*a + b) == n){
                    ways = ways + combination(a + b, a);
                }
            }
        }
        return (int)ways;
    }
}

//Optimized Solution
// class Solution {

//     public long combination(int n, int r) {
//         long result = 1;

//         for (int i = 1; i <= r; i++) {
//             result = result * (n - i + 1) / i;
//         }

//         return result;
//     }

//     public int climbStairs(int n) {
//         long ways = 0;

//         for (int a = 0; 2 * a <= n; a++) {
//             int b = n - 2 * a;
//             ways += combination(a + b, a);
//         }

//         return (int) ways;
//     }
// }