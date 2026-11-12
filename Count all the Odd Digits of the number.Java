class Solution {
    public int countOddDigit(int n) {
    // extract the last digit till n > 0 and check divisibility by 2. 
     int oddCount = 0;
     while( n > 0){
        int digit = n % 10;
     if( digit % 2 != 0){
        oddCount++;
     }
     n = n / 10;
     }
     return oddCount;
    }
}
