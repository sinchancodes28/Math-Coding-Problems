class Solution {
    public int primeUptoN(int n) {
      int count = 0;
      for( int i = 2 ; i < n ; i++){
      boolean isPrime = true;
        for( int j = 2 ; j < n ; j++){
        if( j % i == 0){
          isPrime = false;
          break;       
        }
        }
        if( isPrime){
          count++;
        }
      }
      return count;
    }
}
