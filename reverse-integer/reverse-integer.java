class Solution {
    public int reverse(int x) {
        int reversed = 0;
        int prev_number=0;
        while(x != 0) {
            int digit = x % 10;
            prev_number=reversed;
            reversed = reversed * 10 + digit;
            x /= 10;
            if (reversed/10  != prev_number) {
                return 0;
            }
        }
        return reversed;
    }
}