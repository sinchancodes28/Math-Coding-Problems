class Solution {
    public int LCM(int n1, int n2) {
// GCD * LCM = product of the two numbers
int min = Math.min(n1 , n2);
int gcd = 1;
for( int i = 1 ; i <= min ; i++){
    if( n1 % i == 0 && n2 % i == 0){
        gcd = i;
    }
}
return (n1 * n2) / gcd;
    }
}
