class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int rem = x % 10; //generate last digit
            x = x / 10;   
            //it will take care exceeded of max and min of INT values
            if (rev > Integer.MAX_VALUE / 10 ||
                rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            //update reverse value
            rev = rev * 10 + rem; 
        }

        return rev;
    }
}
