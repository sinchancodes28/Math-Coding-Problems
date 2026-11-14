class Solution {
    public int GCD(int n1, int n2) {
    // take the min of the number and run the loop for 1 to min of n1 , n2 check if i divides both n1 and n2 that is the..the highest is the  gcd 
    int gcd = 1;
   int min = Math.min(n1,n2);
   for( int i = 1 ; i <= min ; i++){
    if( n1 % i == 0 && n2 % i == 0){
gcd = i;
    }
   }
   return gcd;
    }
