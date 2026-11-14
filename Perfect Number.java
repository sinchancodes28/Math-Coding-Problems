Perfect Number : A perfect is the number that is equal to the sum of its positive divisors except the number itself
  class Solution {
    public boolean checkPerfectNumber(int num) {
        // A Perfect Number is the number that is equal to the sum of its  positive divisors except the number itself
        int sum = 0;
     for(int i = 1 ; i < num - 1 ; i++ ){
        if( num % i == 0){
            sum += i;
        }
     }
     return num == sum;
    }
}
