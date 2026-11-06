class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int num = numer1 * denom2 + numer2 * denom1;
        int deno = denom1 * denom2;
        
        int a = num;
        int b = deno;

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return new int[] {num / a, deno / a};
    }
}