Prime Number : Prime Number is the number that is having 1 and itself only 2 factors 
class Solution {
    public boolean isPrime(int n) {
          //your code goes here
          // prime number has two factors 1 and number itself 
          // so start a loop from i = 2 to n - 1 if number % i == 0 then return false because we got the factor if not then return true 
          if( n <= 0){
            return false;
          }
          for( int i = 2 ; i < n = ; i++){
            if( n % i == 0){
                return false;
            }
          }
          return true;
    }
}
