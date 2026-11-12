Armstrong Number : is the number where the total sum of each digit of number raised to the power of total of number is digits is equal to the original number
  Example : 153
  total digit are 3 , so 1 ^ 3 + 5 ^ 3 + 3 ^ 3 = 153 
  code
  class Solution {
    public boolean isArmstrong(int n) {
        int og = n;
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        int am = 0;

        while (og > 0) {
            int digit = og % 10;
            am += (int) Math.pow(digit, count);
            og = og / 10;
        }

        return og == am; 
}
}
