public class Solution {
    public static int zeros(int n) {

        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        int res = 0;
        while (true) {
            if (fact % 10 == 0) {
                res++;
                fact = fact / 10;
            } else {
                break;
            }
        }

        return res;
    }
}