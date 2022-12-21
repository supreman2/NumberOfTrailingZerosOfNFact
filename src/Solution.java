public class Solution {
    public static int zeros(int n) {

        int res = 0;

        // decompose n into prime divisors. how many fives, so many zeros.
        // first divide by 5, then by 25 (i.e. 5*5), then by 625 (i.e. 5*5*5), etc.
        for (int i = 5; i <= n; i = i * 5) {
            res += n / i;
        }

        return res;
    }

}